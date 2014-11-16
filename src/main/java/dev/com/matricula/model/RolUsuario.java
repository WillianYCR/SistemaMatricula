package dev.com.matricula.model;

// Generated 27/04/2014 12:29:47 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * RolUsuario generated by hbm2java
 */
public class RolUsuario implements java.io.Serializable {

  private Integer idRolUsuario;
  private Usuario usuario;
  private Rol rol;
  private char estado;
  private String usuarioInscripcion;
  private Date fechaInscripcion;

  public RolUsuario() {
  }

  public RolUsuario(Usuario usuario, Rol rol, char estado) {
    this.usuario = usuario;
    this.rol = rol;
    this.estado = estado;
  }

  public RolUsuario(Usuario usuario, Rol rol, char estado, String usuarioInscripcion,
          Date fechaInscripcion) {
    this.usuario = usuario;
    this.rol = rol;
    this.estado = estado;
    this.usuarioInscripcion = usuarioInscripcion;
    this.fechaInscripcion = fechaInscripcion;
  }

  public Integer getIdRolUsuario() {
    return this.idRolUsuario;
  }

  public void setIdRolUsuario(Integer idRolUsuario) {
    this.idRolUsuario = idRolUsuario;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Rol getRol() {
    return this.rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public char getEstado() {
    return this.estado;
  }

  public void setEstado(char estado) {
    this.estado = estado;
  }

  public String getUsuarioInscripcion() {
    return this.usuarioInscripcion;
  }

  public void setUsuarioInscripcion(String usuarioInscripcion) {
    this.usuarioInscripcion = usuarioInscripcion;
  }

  public Date getFechaInscripcion() {
    return this.fechaInscripcion;
  }

  public void setFechaInscripcion(Date fechaInscripcion) {
    this.fechaInscripcion = fechaInscripcion;
  }

}
