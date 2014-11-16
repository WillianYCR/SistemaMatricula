package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Apoderado;

public interface ApoderadoDao {

  boolean registrarApoderado(Apoderado apoderado);

  public Integer obtenerUltimoIdApoderado();

  public Apoderado obtenerDatoApoderado(int codigoApoderado);

  public List<Apoderado> obtenerApoderados();

}
