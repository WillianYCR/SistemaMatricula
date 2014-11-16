package dev.com.matricula.model;

public class UsuarioAlumno implements java.io.Serializable {

  private Integer idUsuarioAlumno;
  private Alumno alumno;
  private Usuario usuario;
  private Character estado;

  public UsuarioAlumno() {
  }

  public UsuarioAlumno(Alumno alumno, Usuario usuario) {
    this.alumno = alumno;
    this.usuario = usuario;
  }

  public UsuarioAlumno(Alumno alumno, Usuario usuario, Character estado) {
    this.alumno = alumno;
    this.usuario = usuario;
    this.estado = estado;
  }

  public Integer getIdUsuarioAlumno() {
    return this.idUsuarioAlumno;
  }

  public void setIdUsuarioAlumno(Integer idUsuarioAlumno) {
    this.idUsuarioAlumno = idUsuarioAlumno;
  }

  public Alumno getAlumno() {
    return this.alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Character getEstado() {
    return this.estado;
  }

  public void setEstado(Character estado) {
    this.estado = estado;
  }

}
