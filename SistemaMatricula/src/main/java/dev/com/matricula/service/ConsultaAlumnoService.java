package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.Matricula;

public interface ConsultaAlumnoService {

  public List<Matricula> obtenerMatriculaAlumno(int codigo);

}
