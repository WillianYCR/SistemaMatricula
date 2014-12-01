package dev.com.matricula.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;

@Component
public class AlumnoBean {

  private Alumno alumno;
  @Autowired
  private AlumnoService alumnoService;

  public String registrarAlumno() {
    if (alumnoService.registrarAlumno(alumno)) {
      return "EXITOSO";
    }
    return "FALLIDO";
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

}
