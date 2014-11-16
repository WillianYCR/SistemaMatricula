package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.ArrayList;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Curso;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.service.ConsultaAlumnoService;

public class ConsultaAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Matricula matricula;
  private ArrayList<Matricula> matriculaList;
  private ConsultaAlumnoService consultaAlumnoService;

  public ConsultaAlumnoBean() {
    alumno = new Alumno();
    curso = new Curso();
    matricula = new Matricula();
  }

  public String obtenerMatriculas() {
    matriculaList =
            (ArrayList<Matricula>) consultaAlumnoService
                    .obtenerMatriculaAlumno(SistemaSession.getAlumnoId());
    return "/pages/consultaAlumnos.xhtml";

  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Matricula getMatricula() {
    return matricula;
  }

  public void setMatricula(Matricula matricula) {
    this.matricula = matricula;
  }

  public ArrayList<Matricula> getMatriculaList() {
    return matriculaList;
  }

  public void setMatriculaList(ArrayList<Matricula> matriculaList) {
    this.matriculaList = matriculaList;
  }

  public void setConsultaAlumnoService(ConsultaAlumnoService consultaAlumnoService) {
    this.consultaAlumnoService = consultaAlumnoService;
  }
}
