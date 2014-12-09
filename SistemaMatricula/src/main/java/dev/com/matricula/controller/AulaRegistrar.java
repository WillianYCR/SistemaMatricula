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

@WebServlet(name = "AulaRegistrar", urlPatterns = { "/aulaRegistrar.do" })
public class AulaRegistrar extends HttpServlet {

  private static final long serialVersionUID = 1L;
  @Autowired
  private AulaService aulaService;

  // @Autowired
  // private AulaDao daoI;

  public AulaRegistrar() {
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
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // validar campos vacios
    String tipo = request.getParameter("txtTipo");
    String capacidad = request.getParameter("txtCapacidad");
    if (tipo.equals("") || capacidad.equals("") || capacidad.length() > 5) {
      JOptionPane.showMessageDialog(null, "Ingrese valores correctos necesarios");
      request.getRequestDispatcher("AulaRegistrar.jsp").forward(request, response);
    } else {
      short iCapacidad = Short.parseShort(capacidad);
      Aula objAula = new Aula();
      objAula.setTipo(tipo);
      objAula.setCapacidad(iCapacidad);
      JOptionPane.showMessageDialog(null, "objeto Tipo : " + objAula.getTipo() + "\n"
          + "objeto Capadidad: " + objAula.getCapacidad());
      // Enviar datos para alamcenar
      // if(aulaService.registrarAula(objAula)){
      if (aulaService.registrarAula(objAula)) {
        JOptionPane.showMessageDialog(null, "Registro grabado correctamente");
        request.getRequestDispatcher("AulaListar.jsp").forward(request, response);
      } else {
        JOptionPane.showMessageDialog(null, "Error al registrar el aula");
        request.getRequestDispatcher("jsp/AulaRegistrar.jsp").forward(request, response);
      }
    }
  }

}
