package dev.com.matricula.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

  @Autowired
  private UsuarioDao usuarioDao;
  @Autowired
  private RolUsuarioDao rolUsuarioDao;
  @Autowired
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public boolean registrarUsuario(Usuario usuarioP) {
    boolean rspt = usuarioDao.registrarUsuario(usuarioP);
    return rspt;
  }

  @Override
  public boolean registrarAccesoRol(RolUsuario rolUsuarioP) {
    boolean rspt = rolUsuarioDao.registrarRolUsuario(rolUsuarioP);
    return rspt;
  }

  @Override
  public Integer buscarUltimoIdRolUsuario() {
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  @Override
  public Integer buscarUltimoIdUsuario() {
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  @Override
  public String obtenerLoginUsuario(int idAlumno) {
    int idUsuario = usuarioAlumnoDao.obtenerIdUsuarioPorIdAlumno(idAlumno);
    return usuarioDao.obtenerLoginUsuario(idUsuario);
  }

}
