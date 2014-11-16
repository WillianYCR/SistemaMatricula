package dev.com.matricula.service;

import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;

public interface MatriculaMantenimientoApoderadoService {

  public Integer buscarUltimoidApoderado();

  public Integer buscarUltimoidUsuario();

  public Integer buscarUltimoidRolUsuario();

  public Integer buscarUltimoidUsuarioAlumno();

  boolean registrarApoderado(Apoderado apoderado);

  boolean registrarUsuario(Usuario usuario);

  boolean registrarRolUsuario(RolUsuario rolUsuario);

  boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno);

}
