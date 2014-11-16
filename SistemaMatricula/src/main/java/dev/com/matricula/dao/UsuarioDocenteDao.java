package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.UsuarioDocente;

public interface UsuarioDocenteDao {

  public boolean registrarUsuarioDocente(UsuarioDocente usuarioDocente);

  public Integer obtenerUltimoIdUsuarioDocente();

  public List<UsuarioDocente> obtenerUsuarioDocentes();

  public List<UsuarioDocente> obtenerIdDocente(int codigoUsuario);

}
