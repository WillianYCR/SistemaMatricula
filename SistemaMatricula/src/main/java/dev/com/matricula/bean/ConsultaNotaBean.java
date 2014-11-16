package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.ArrayList;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Curso;
import dev.com.matricula.model.Notas;
import dev.com.matricula.service.ConsultaNotaService;

public class ConsultaNotaBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Notas notas;
  private ArrayList<Notas> notasList;
  private ConsultaNotaService consultaNotaService;

  public ConsultaNotaBean() {
    alumno = new Alumno();
    curso = new Curso();
    notas = new Notas();
  }

  public String obtenerNotasAlumno() {
    notasList = (ArrayList<Notas>) consultaNotaService.obtenerNotasAlumno(SistemaSession.getAlumnoId());
    return "/pages/consultaCursos.xhtml";

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

  public Notas getNotas() {
    return notas;
  }

  public void setNotas(Notas notas) {
    this.notas = notas;
  }

  public ArrayList<Notas> getNotasList() {
    return notasList;
  }

  public void setNotasList(ArrayList<Notas> notasList) {
    this.notasList = notasList;
  }

  public void setConsultaNotaService(ConsultaNotaService consultaNotaService) {
    this.consultaNotaService = consultaNotaService;
  }

}
