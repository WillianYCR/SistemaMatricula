package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.MatriculaMantenimientoAlumnoService;

public class MatriculaMantenimientoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Map<String, String> sexoMap = new HashMap<String, String>();
  private Alumno alumno;
  private Usuario usuario;
  private UsuarioAlumno usuarioAlumno;
  private Rol rol;
  private RolUsuario rolUsuario;
  private MatriculaMantenimientoAlumnoService matriculaMantenimientoAlumnoService;

  public MatriculaMantenimientoAlumnoBean() {
    sexoMap.put("Masculino", "M");
    sexoMap.put("Femenino", "F");
    alumno = new Alumno();
    usuario = new Usuario();
    rolUsuario = new RolUsuario();
    rol = new Rol();
    usuarioAlumno = new UsuarioAlumno();
  }

  public String registrarAlumno() {
    alumno.setIdAlumno(matriculaMantenimientoAlumnoService.buscarUltimoidAlumno());
    alumno.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    // Registrar AlumnoDTO
    boolean rsptAlumno = matriculaMantenimientoAlumnoService.registrarAlumno(alumno);

    // Registrar Usuario
    usuario.setIdUsuario(matriculaMantenimientoAlumnoService.buscarUltimoidUsuario());
    usuario.setNombre(alumno.getNombre() + " " + alumno.getApellidoMaterno() + " " +alumno.getApellidoPaterno());
    usuario.setDni(alumno.getDni());
    usuario.setLogin(alumno.getNombre() + alumno.getApellidoPaterno());
    usuario.setClave("123456");
    usuario.setEstado('0');
    alumno.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    boolean rsptUsuario = matriculaMantenimientoAlumnoService.registrarUsuario(usuario);

    // Registrar Rol de Acceso
    rol.setIdRol(1);
    rolUsuario.setIdRolUsuario(matriculaMantenimientoAlumnoService.buscarUltimoidRolUsuario());
    rolUsuario.setRol(rol);
    rolUsuario.setUsuario(usuario);
    rolUsuario.setEstado('1');
    alumno.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    boolean rsptRolUsuario = matriculaMantenimientoAlumnoService.registrarRolUsuario(rolUsuario);

    // Registrar Usuario_Alumno
    usuarioAlumno.setIdUsuarioAlumno(matriculaMantenimientoAlumnoService
            .buscarUltimoidUsuarioAlumno());
    usuarioAlumno.getUsuario().setIdUsuario(usuario.getIdUsuario());
    usuarioAlumno.getAlumno().setIdAlumno(alumno.getIdAlumno());
    boolean rsptUsuarioAlumno =
            matriculaMantenimientoAlumnoService.registrarUsuarioAlumno(usuarioAlumno);

    if (rsptAlumno && rsptUsuario && rsptRolUsuario && rsptUsuarioAlumno)
      return "MATRICULA";

    return "FALLIDO";
  }

  public Map<String, String> getSexoMap() {
    return sexoMap;
  }

  public void setSexoMap(Map<String, String> sexoMap) {
    this.sexoMap = sexoMap;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public RolUsuario getRolUsuario() {
    return rolUsuario;
  }

  public void setRolUsuario(RolUsuario rolUsuario) {
    this.rolUsuario = rolUsuario;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public UsuarioAlumno getUsuarioAlumno() {
    return usuarioAlumno;
  }

  public void setUsuarioAlumno(UsuarioAlumno usuarioAlumno) {
    this.usuarioAlumno = usuarioAlumno;
  }

  public void setMatriculaMantenimientoAlumnoService(
          MatriculaMantenimientoAlumnoService matriculaMantenimientoAlumnoService) {
    this.matriculaMantenimientoAlumnoService = matriculaMantenimientoAlumnoService;
  }
}
