package dev.com.matricula.dto;

public class RolUsuarioDTO {

  private Integer id;
  private UsuarioDTO usuario;
  private RolDTO rol;
  private Character estado;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UsuarioDTO getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioDTO usuario) {
    this.usuario = usuario;
  }

  public RolDTO getRol() {
    return rol;
  }

  public void setRol(RolDTO rol) {
    this.rol = rol;
  }

  public Character getEstado() {
    return estado;
  }

  public void setEstado(Character estado) {
    this.estado = estado;
  }

}
