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

import dev.com.matricula.model.Docente;
import dev.com.matricula.service.DocenteService;

public class DocenteListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private DocenteService docenteService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// JOptionPane.showMessageDialog(null, "Docente Listar doGet");
		ArrayList<Docente> docenteListar;
		try {
			docenteListar = (ArrayList<Docente>) docenteService.listarDocente();
			request.getSession().setAttribute("docenteListar", docenteListar);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error Mesagg: " + e.getMessage());
		} finally {
			request.getRequestDispatcher("DocenteListar.jsp").forward(request,
					response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JOptionPane.showMessageDialog(null, "Docente Listar doPost");
	}

}
