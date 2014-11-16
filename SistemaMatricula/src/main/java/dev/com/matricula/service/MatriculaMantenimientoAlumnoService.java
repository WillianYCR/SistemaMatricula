package dev.com.matricula.service;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;

public interface MatriculaMantenimientoAlumnoService {

  public Integer buscarUltimoidAlumno();

  public Integer buscarUltimoidUsuario();

  public Integer buscarUltimoidRolUsuario();

  public Integer buscarUltimoidUsuarioAlumno();

  boolean registrarAlumno(Alumno alumno);

  boolean registrarUsuario(Usuario usuario);

  boolean registrarRolUsuario(RolUsuario rolUsuario);

  boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno);

}
