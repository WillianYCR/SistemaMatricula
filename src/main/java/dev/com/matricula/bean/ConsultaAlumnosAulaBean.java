package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;

import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaAlumnosAulaService;

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

  // Getter and setter



  public void setConsultaAlumnosAulaService(ConsultaAlumnosAulaService consultaAlumnosAulaService) {
    this.consultaAlumnosAulaService = consultaAlumnosAulaService;
  }

  public List<AlumnoDTO> getAlumnosList() {
    return alumnosList;
  }

  public void setAlumnosList(List<AlumnoDTO> alumnosList) {
    this.alumnosList = alumnosList;
  }

}
