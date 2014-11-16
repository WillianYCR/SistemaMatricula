package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  public boolean registrarUsuario(Usuario usuarioP) {
    boolean rspt = usuarioDao.registrarUsuario(usuarioP);
    return rspt;
  }

  public boolean registrarAccesoRol(RolUsuario rolUsuarioP) {
    boolean rspt = rolUsuarioDao.registrarRolUsuario(rolUsuarioP);
    return rspt;
  }

  public Integer buscarUltimoIdRolUsuario() {
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  public Integer buscarUltimoIdUsuario() {
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  public void setUsuarioDao(UsuarioDao usuarioDao) {
    this.usuarioDao = usuarioDao;
  }

  public void setRolUsuarioDao(RolUsuarioDao rolUsuarioDao) {
    this.rolUsuarioDao = rolUsuarioDao;
  }

  public void setUsuarioAlumnoDao(UsuarioAlumnoDao usuarioAlumnoDao) {
    this.usuarioAlumnoDao = usuarioAlumnoDao;
  }

  public String obtenerLoginUsuario(int idAlumno) {
    int idUsuario = usuarioAlumnoDao.obtenerIdUsuarioPorIdAlumno(idAlumno);
    return usuarioDao.obtenerLoginUsuario(idUsuario);
  }

}
