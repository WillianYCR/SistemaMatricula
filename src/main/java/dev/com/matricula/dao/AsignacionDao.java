package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Asignacion;

public interface AsignacionDao {

  public boolean registrarAsignacion(Asignacion asignacion);

  public Integer obtenerUltimoIdAsignacion();

  public List<Asignacion> obtenerAsignaciones();

  public List<Asignacion> obtenerAsignacionAlumno(int codigoAnhoEscolar);

}
