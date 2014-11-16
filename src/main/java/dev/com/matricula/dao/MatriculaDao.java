package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Matricula;

public interface MatriculaDao {

  public boolean registrarMatricula(Matricula matricula);

  public Integer obtenerUltimoIdMatricula();

  public List<Matricula> obtenerMatriculas();

  public List<Matricula> obtenerMatriculaAlumno(int codigoAnhoEscolar);
}
