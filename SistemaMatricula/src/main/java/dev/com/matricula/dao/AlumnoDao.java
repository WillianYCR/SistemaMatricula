package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Alumno;

public interface AlumnoDao {

  boolean registrarAlumno(Alumno alumno);

  public Integer obtenerUltimoIdAlumno();

  public Alumno obtenerDatoAlumno(int codigoAlumno);

  public List<Alumno> obtenerAlumnos();
  
  public List<Alumno> listarAlumnosAula();
  
  public List<Alumno> listarAlumno();

}
