package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.Asignacion;

public interface ConsultaCursosService {

  public List<Asignacion> obtenerCursosAlumno(int codigo);
}
