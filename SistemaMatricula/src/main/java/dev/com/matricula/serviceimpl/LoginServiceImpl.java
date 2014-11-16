package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.LoginService;
import dev.com.matricula.util.Conversor;

public class LoginServiceImpl implements LoginService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private Usuario usuario;
  private RolUsuario rolUsuario;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  public UsuarioDTO obtenerDatoUsuarioAcceso(String login) {
    usuario = usuarioDao.obtenerDatoUsuarioAcceso(login);
    return Conversor.obtenerUsuarioDTO(usuario);
  }

  public RolUsuarioDTO obtenerDatoUsuarioRol(int idUsuario) {
    rolUsuario = rolUsuarioDao.obtenerDatoRolUsuario(idUsuario);
    return Conversor.obtenerRolUsuarioDTO(rolUsuario);
  }

  public List<UsuarioAlumnoDTO> obtenerPermisosAlumnos(Integer idUsuario) {
    List<UsuarioAlumno> lista = usuarioAlumnoDao.obtenerListaAlumnosRelacionados(idUsuario);
    return Conversor.obtenerListaUsuarioAlumnoDTO(lista);
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
}
