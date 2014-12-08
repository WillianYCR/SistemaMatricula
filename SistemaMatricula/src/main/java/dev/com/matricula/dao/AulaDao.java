package dev.com.matricula.dao;

import dev.com.matricula.model.Aula;
import java.util.List;

public interface AulaDao {

  boolean persistirAula(Aula alumno);

  public List<Aula> listarAula();
}
