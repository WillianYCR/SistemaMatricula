package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Notas;

public interface NotasDao {

  public boolean registrarNotas(Notas notas);

  public Integer obtenerUltimoIdNotas();

  public List<Notas> obtenerNotas();

  public List<Notas> obtenerNotasAlumno(int codigoAlumno);
}
