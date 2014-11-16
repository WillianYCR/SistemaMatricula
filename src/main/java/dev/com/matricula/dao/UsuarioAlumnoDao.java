package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.UsuarioAlumno;

public interface UsuarioAlumnoDao {

  public boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno);

  public Integer obtenerUltimoIdUsuarioAlumno();

  public List<UsuarioAlumno> obtenerUsuarioAlumnos();

  public List<UsuarioAlumno> obtenerIdAlumno(int codigoUsuario);

  public Integer obtenerIdUsuarioPorIdAlumno(int idAlumno);

  public List<UsuarioAlumno> obtenerListaAlumnosRelacionados(int codigoUsuario);

}
