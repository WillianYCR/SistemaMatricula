package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.RolUsuario;

public interface RolUsuarioDao {

  public boolean registrarRolUsuario(RolUsuario rolUsuario);

  public Integer obtenerUltimoIdRolUsuario();

  public RolUsuario obtenerDatoRolUsuario(Integer idUsuario);

  public List<RolUsuario> obtenerRolusuarios();

}
