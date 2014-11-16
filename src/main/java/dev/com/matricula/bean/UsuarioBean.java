package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

public class UsuarioBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private RolUsuario rolUsuario;
  private Rol rol;
  private UsuarioService usuarioService;
  private String confirma = "";
  private boolean rsptUsuario;
  private boolean rsptAccesoRol;

  public UsuarioBean() {
    usuario = new Usuario();
    rol = new Rol();
    rolUsuario = new RolUsuario();
  }

  public String registrarUsuario() {
    if (usuario.getClave().equals(getConfirma())) {

      // Completando los Datos para la entidad Usuario
      usuario.setIdUsuario(usuarioService.buscarUltimoIdUsuario());
      usuario.setEstado('1');
      usuario.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
      usuario.setFechaInscripcion(null);
      rsptUsuario = usuarioService.registrarUsuario(usuario);

      // Completando los Datos para un Rol de un nuevo Usuario
      if (rsptUsuario) {
        rol.setIdRol(1);
        rolUsuario.setIdRolUsuario(usuarioService.buscarUltimoIdRolUsuario());
        rolUsuario.setRol(rol);
        rolUsuario.setUsuario(usuario);
        rolUsuario.setEstado('1');
        rolUsuario.setUsuarioInscripcion(SistemaSession.usuario.getId().toString());
        rolUsuario.setFechaInscripcion(null);
        rsptAccesoRol = usuarioService.registrarAccesoRol(rolUsuario);
        
      }
    }
    return "REGISTRAR_USUARIO";
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

  public String getConfirma() {
    return confirma;
  }

  public void setConfirma(String confirma) {
    this.confirma = confirma;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public boolean isRsptUsuario() {
    return rsptUsuario;
  }

  public void setRsptUsuario(boolean rsptUsuario) {
    this.rsptUsuario = rsptUsuario;
  }

  public boolean isRsptAccesoRol() {
    return rsptAccesoRol;
  }

  public void setRsptAccesoRol(boolean rsptAccesoRol) {
    this.rsptAccesoRol = rsptAccesoRol;
  }

  public void setUsuarioService(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }
}
