package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.dto.UsuarioDTO;

public interface LoginService {

  public UsuarioDTO obtenerDatoUsuarioAcceso(String login);

  public RolUsuarioDTO obtenerDatoUsuarioRol(int idUsuario);

  public List<UsuarioAlumnoDTO> obtenerPermisosAlumnos(Integer codigoUsuario);
}
