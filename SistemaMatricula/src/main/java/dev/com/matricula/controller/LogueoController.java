package dev.com.matricula.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import dev.com.matricula.bean.SistemaSession;
import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.service.LoginService;

public class LogueoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private LoginService loginService;
	private UsuarioDTO usuarioDto;
	private RolUsuarioDTO rolUsuarioDto;
	private String sUsuario;
	private String sClave;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		sUsuario = request.getParameter("txtUsuario");
		sClave = request.getParameter("txtClave");
		try {
			if (!validarCampos()) {
				request.getRequestDispatcher("Logueo.jsp").forward(request,
						response);
				return;
			}
			String nameBoton = request.getParameter("btnProceso");
			if (nameBoton.equals("Ingresar")) {
				usuarioDto = loginService.obtenerDatoUsuarioAcceso(sUsuario);
				if (usuarioDto == null) {
					JOptionPane.showMessageDialog(null, "El usuario no existe");
					request.getRequestDispatcher("Logueo.jsp").forward(request,
							response);
					return;
				}
				JOptionPane.showMessageDialog(null, "El usuario Dto:"
						+ usuarioDto.getNombres());
				// Cargar datos de sesion de usuario
				SistemaSession.usuario = usuarioDto;
				// TODO:Evaluar tema de encriptacion de clave
				if (!usuarioDto.getClave().equals(sClave)) {
					JOptionPane.showMessageDialog(null, "Clave incorrecta!!!");
					request.getRequestDispatcher("Logueo.jsp").forward(request,
							response);
					return;
				}
				rolUsuarioDto = loginService.obtenerDatoUsuarioRol(usuarioDto
						.getId());
				if (rolUsuarioDto == null) {
					JOptionPane.showMessageDialog(null, "Rol suspendido!!!");
					request.getRequestDispatcher("Logueo.jsp").forward(request,
							response);
				}
				// Cargar datos de sesion de rol de usuario
				SistemaSession.rolUsuario = rolUsuarioDto;
				// Validar el tipo de ingreso
				switch (SistemaSession.rolUsuario.getRol().getId()) {
				case 1:
					JOptionPane.showMessageDialog(null, "Rol --> Alumno");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Rol --> Apoderado");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Rol --> Docente");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Rol --> Matriculante");
					break;
				case 5:
					JOptionPane
							.showMessageDialog(null, "Rol --> Administrador");
					break;
				default:
					break;
				}

				JOptionPane.showMessageDialog(null,
						"Bienvenido "
								+ usuarioDto.getNombres()
								+ " -- "
								+ SistemaSession.rolUsuario.getRol()
										.getDescripcion());
				request.getRequestDispatcher("Prueba.jsp").forward(request,
						response);
			} else if (nameBoton.equals("Recuperar")) {
				request.getRequestDispatcher("Logueo.jsp").forward(request,
						response);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error Mesagg en logueo: " + e.getMessage());
		}
	}

	private boolean validarCampos() {
		if (sUsuario.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese el usuario");
			return false;
		}
		if (sClave.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese la clave");
			return false;
		}
		return true;
	}

}
