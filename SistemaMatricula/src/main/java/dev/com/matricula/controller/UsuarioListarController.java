package dev.com.matricula.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

//@WebServlet(name = "SeccionListarController", urlPatterns = { "/seccionListarController.do" })
public class UsuarioListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Usuario> usuarioListar;
		try {
			usuarioListar = (ArrayList) usuarioService.listarUsuario();
			request.getSession().setAttribute("usuarioListar", usuarioListar);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error Mesagg: " + e.getMessage());
		} finally {
			request.getRequestDispatcher("UsuarioListar.jsp").forward(request,
					response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
