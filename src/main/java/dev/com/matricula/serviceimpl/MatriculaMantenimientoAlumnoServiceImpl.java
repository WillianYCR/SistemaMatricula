package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.MatriculaMantenimientoAlumnoService;

public class MatriculaMantenimientoAlumnoServiceImpl implements MatriculaMantenimientoAlumnoService {

  private AlumnoDao alumnoDao;
  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  public Integer buscarUltimoidAlumno() {
    return alumnoDao.obtenerUltimoIdAlumno();
  }

  public Integer buscarUltimoidUsuario() {
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  public Integer buscarUltimoidRolUsuario() {
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  public Integer buscarUltimoidUsuarioAlumno() {
    return usuarioAlumnoDao.obtenerUltimoIdUsuarioAlumno();
  }

  public boolean registrarAlumno(Alumno alumno) {
    return alumnoDao.registrarAlumno(alumno);
  }

  public boolean registrarUsuario(Usuario usuario) {
    return usuarioDao.registrarUsuario(usuario);
  }

  public boolean registrarRolUsuario(RolUsuario rolUsuario) {
    return rolUsuarioDao.registrarRolUsuario(rolUsuario);
  }

  public boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno) {
    return usuarioAlumnoDao.registrarUsuarioAlumno(usuarioAlumno);
  }

  public void setAlumnoDao(AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
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
