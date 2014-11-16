package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.MatriculaMantenimientoApoderadoService;

public class MatriculaMantenimientoApoderadoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Map<String, String> sexoMap = new HashMap<String, String>();
  private Map<String, String> civilMap = new HashMap<String, String>();
  private Alumno alumno;
  private Apoderado apoderado;
  private Usuario usuario;
  private UsuarioAlumno usuarioAlumno;
  private Rol rol;
  private RolUsuario rolUsuario;
  private MatriculaMantenimientoApoderadoService matriculaMantenimientoApoderadoService;

  public MatriculaMantenimientoApoderadoBean() {
    sexoMap.put("Masculino", "M");
    sexoMap.put("Femenino", "F");
    civilMap.put("Soltero", "S");
    civilMap.put("Casado", "C");
    civilMap.put("Viudo", "V");
    civilMap.put("Divorciado", "D");
    alumno = new Alumno();
    apoderado = new Apoderado();
    usuario = new Usuario();
    rolUsuario = new RolUsuario();
    rol = new Rol();
    usuarioAlumno = new UsuarioAlumno();
  }

  public String registrarApoderado() {
    apoderado.setIdApoderado(matriculaMantenimientoApoderadoService.buscarUltimoidApoderado());
    apoderado.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    // Registrar AlumnoDTO
    boolean rsptApoderado = matriculaMantenimientoApoderadoService.registrarApoderado(apoderado);

    // Registrar Usuario
    usuario.setIdUsuario(matriculaMantenimientoApoderadoService.buscarUltimoidUsuario());
    usuario.setNombre(apoderado.getNombre() + " " + apoderado.getApellidoMaterno() + " " + apoderado.getApellidoPaterno());
    usuario.setDni(apoderado.getDni());
    usuario.setLogin(apoderado.getNombre() + apoderado.getApellidoPaterno());
    usuario.setClave("12345");
    usuario.setEstado('0');
    usuario.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    boolean rsptUsuario = matriculaMantenimientoApoderadoService.registrarUsuario(usuario);

    // Registrar Rol de Acceso
    rol.setIdRol(2);
    rolUsuario.setIdRolUsuario(matriculaMantenimientoApoderadoService.buscarUltimoidRolUsuario());
    rolUsuario.setRol(rol);
    rolUsuario.setUsuario(usuario);
    rolUsuario.setEstado('1');
    rolUsuario.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
    
    boolean rsptRolUsuario = matriculaMantenimientoApoderadoService.registrarRolUsuario(rolUsuario);

    // Apoderado para al alumno
    alumno.setIdAlumno(1009);

    // Registrar Usuario_Alumno
    usuarioAlumno.setIdUsuarioAlumno(matriculaMantenimientoApoderadoService
            .buscarUltimoidUsuarioAlumno());
    usuarioAlumno.getUsuario().setIdUsuario(usuario.getIdUsuario());
    usuarioAlumno.getAlumno().setIdAlumno(alumno.getIdAlumno());
    boolean rsptUsuarioAlumno =
            matriculaMantenimientoApoderadoService.registrarUsuarioAlumno(usuarioAlumno);

    if (rsptApoderado && rsptUsuario && rsptRolUsuario && rsptUsuarioAlumno)
      return "MATRICULA";

    return "FALLIDO";
  }

  public Map<String, String> getSexoMap() {
    return sexoMap;
  }

  public void setSexoMap(Map<String, String> sexoMap) {
    this.sexoMap = sexoMap;
  }

  public Map<String, String> getCivilMap() {
    return civilMap;
  }

  public void setCivilMap(Map<String, String> civilMap) {
    this.civilMap = civilMap;
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

  public Apoderado getApoderado() {
    return apoderado;
  }

  public void setApoderado(Apoderado apoderado) {
    this.apoderado = apoderado;
  }

  public void setMatriculaMantenimientoApoderadoService(
          MatriculaMantenimientoApoderadoService matriculaMantenimientoApoderadoService) {
    this.matriculaMantenimientoApoderadoService = matriculaMantenimientoApoderadoService;
  }
}
