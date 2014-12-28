package dev.com.matricula.dao;

import java.util.List;
import dev.com.matricula.model.Docente;

public interface DocenteDao {

  public List<Docente> listarDocente();

  public List<Docente> obtenerAlgunosDatosDocente();

}
