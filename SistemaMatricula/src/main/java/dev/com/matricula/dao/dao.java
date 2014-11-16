package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Notas;

public interface dao {
  public String mostrarConsulta();

  public List<Notas> mostrarNotas(String codigo);
}
