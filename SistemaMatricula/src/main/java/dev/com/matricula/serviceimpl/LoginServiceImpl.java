package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  private UsuarioDao usuarioDao;
  @Autowired
  private RolUsuarioDao rolUsuarioDao;
  @Autowired
  private UsuarioAlumnoDao usuarioAlumnoDao;

  private RolUsuario rolUsuario;
  private Usuario usuario;

  @Override
  public UsuarioDTO obtenerDatoUsuarioAcceso(String login) {
    usuario = usuarioDao.obtenerDatoUsuarioAcceso(login);
    return Conversor.obtenerUsuarioDTO(usuario);
  }

  @Override
  public RolUsuarioDTO obtenerDatoUsuarioRol(int idUsuario) {
    rolUsuario = rolUsuarioDao.obtenerDatoRolUsuario(idUsuario);
    return Conversor.obtenerRolUsuarioDTO(rolUsuario);
  }

  @Override
  public List<UsuarioAlumnoDTO> obtenerPermisosAlumnos(Integer idUsuario) {
    List<UsuarioAlumno> lista = usuarioAlumnoDao.obtenerListaAlumnosRelacionados(idUsuario);
    return Conversor.obtenerListaUsuarioAlumnoDTO(lista);
  }

}
