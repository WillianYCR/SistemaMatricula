package dev.com.matricula.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import dev.com.matricula.model.Aula;
import dev.com.matricula.service.AulaService;

public class AulaActualizarController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Autowired
	private AulaService aulaService;

	private String sTipo;
	private String sCapacidad;

	public AulaActualizarController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JOptionPane.showMessageDialog(null, "Logueo:AulaActualizar doGet");
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// JOptionPane.showMessageDialog(null, "Logueo:AulaActualizar doPost");
		String idaula = request.getParameter("txtIdAula");
		sTipo = request.getParameter("txtTipo");
		sCapacidad = request.getParameter("txtCapacidad");

		try {
			if (validarCampos()) {
				Aula objAula = new Aula();
				objAula.setIdAula(Integer.parseInt(idaula));
				objAula.setTipo(sTipo);
				objAula.setCapacidad(Short.parseShort(sCapacidad));

				String nameBoton = request.getParameter("btnProceso");
				if (nameBoton.equals("Actualizar")) {
					if (aulaService.actualizarAula(objAula)) {
						JOptionPane.showMessageDialog(null,
								"Actualizacion satisfactoria!!!");
						request.getRequestDispatcher("aulaListarController.do")
								.forward(request, response);
					} else {
						JOptionPane.showMessageDialog(null,
								"Error de actualizacion");
						request.getRequestDispatcher("AulaListar.jsp").forward(
								request, response);
					}
				} else {
					if (aulaService.eliminarAula(objAula)) {
						JOptionPane.showMessageDialog(null,
								"Eliminacion exitosa!!!");
						request.getRequestDispatcher("aulaListarController.do")
								.forward(request, response);
					} else {
						JOptionPane.showMessageDialog(null,
								"Error de eliminacion");
						request.getRequestDispatcher("AulaListar.jsp").forward(
								request, response);
					}
				}
			} else {
				request.getRequestDispatcher("aulaActuralizar.jsp").forward(
						request, response);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error Mesagg: " + e.getMessage());
		}
	}

	private boolean validarCampos() {
		if (sTipo.equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese la descripcion");
			return false;
		}
		if (sCapacidad.equals("")) {
			JOptionPane
					.showMessageDialog(null, "Ingrese capacidas de personas");
			return false;
		}
		if (sCapacidad.length() > 2) {
			JOptionPane
					.showMessageDialog(null,
							"El numero de capacidad de personas debe tener maximo 2 digitos");
			return false;
		}
		if (sTipo.length() > 30) {
			JOptionPane.showMessageDialog(null,
					"la descripcion solo permite 30 caracteres como maximo");
			return false;
		}
		return true;
	}
}
