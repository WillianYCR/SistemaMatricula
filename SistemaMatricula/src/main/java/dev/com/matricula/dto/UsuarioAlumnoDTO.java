package dev.com.matricula.dto;

public class UsuarioAlumnoDTO {

  private Integer id;
  private AlumnoDTO alumno;
  private UsuarioDTO usuario;
  private Character estado;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AlumnoDTO getAlumno() {
    return alumno;
  }

  public void setAlumno(AlumnoDTO alumno) {
    this.alumno = alumno;
  }

  public UsuarioDTO getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioDTO usuario) {
    this.usuario = usuario;
  }

  public Character getEstado() {
    return estado;
  }

  public void setEstado(Character estado) {
    this.estado = estado;
  }

}
