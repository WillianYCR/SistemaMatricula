package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.service.ConsultaAlumnosAulaService;

@Component
public class ConsultaAlumnosAulaBean implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private List<AlumnoDTO> alumnosList;
  private ConsultaAlumnosAulaService consultaAlumnosAulaService;

  public ConsultaAlumnosAulaBean() {
  }

  public String listarAlumnosAula() {
    alumnosList = consultaAlumnosAulaService.listarAlumnosAula();
    return "/pages/consultaAlumnosAula.xhtml";
  }

  public List<AlumnoDTO> getAlumnosList() {
    return alumnosList;
  }

  public void setAlumnosList(List<AlumnoDTO> alumnosList) {
    this.alumnosList = alumnosList;
  }

}
