package dev.com.matricula.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import dev.com.matricula.model.Aula;
import dev.com.matricula.service.AulaService;

//@WebServlet(name = "AulaListarController", urlPatterns = { "/aulaListarController.do" })
public class AulaListarController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Autowired
	private AulaService aulaService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// JOptionPane.showMessageDialog(null, "Logueo:AulaListar doGet");
		ArrayList<Aula> aulaListar;
		try {
			aulaListar = (ArrayList<Aula>) aulaService.listarAula();
			request.getSession().setAttribute("aulaListar", aulaListar);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error Mesagg: " + e.getMessage());
		} finally {
			request.getRequestDispatcher("AulaListar.jsp").forward(request,
					response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// JOptionPane.showMessageDialog(null, "Logueo:AulaListar doPost");
		doGet(request, response);
	}

}
