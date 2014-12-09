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

import dev.com.matricula.model.Aula;
import dev.com.matricula.service.AulaService;

@WebServlet(name = "AulaListar", urlPatterns = { "/aulaListar.do" })
public class AulaListar extends HttpServlet {

  private static final long serialVersionUID = 1L;
  @Autowired
  private AulaService aulaService;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
        config.getServletContext());
  }

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ArrayList aulaListar = new ArrayList();
    Aula aula = new Aula();
    try {
      JOptionPane.showMessageDialog(null, "Si ingresa al post");
      // aulaListar = (ArrayList) aulaService.listarAula();
      aula.setIdAula(1);
      aula.setTipo("Aula virtual");
      aulaListar.add(aula);
      // aula.setCapacidad(1);
      JOptionPane.showMessageDialog(null, "Paso la lista");
      // utilizar una session
      request.getSession().setAttribute("aulaListar", aulaListar);
      request.getRequestDispatcher("AulaListar.jsp").forward(request, response);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error Mesagg: " + e.getMessage());
      JOptionPane.showMessageDialog(null, "Error cause: " + e.getCause());
      JOptionPane.showMessageDialog(null, "Error class: " + e.getClass());
      request.getRequestDispatcher("AulaListar.jsp").forward(request, response);
    }
  }

}
