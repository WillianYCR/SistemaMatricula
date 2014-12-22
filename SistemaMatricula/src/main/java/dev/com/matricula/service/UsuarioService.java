package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;

public interface UsuarioService {

  public boolean registrarUsuario(Usuario usuario);

  public boolean registrarAccesoRol(RolUsuario rolUsuario);

  public Integer buscarUltimoIdRolUsuario();

  public Integer buscarUltimoIdUsuario();

  public String obtenerLoginUsuario(int idAlumno);
  
  public List<Usuario> listarUsuario();

}
