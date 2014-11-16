package dev.com.matricula.dto;

public class UsuarioDTO {

  private Integer id;
  private String nombres;
  private String dni;
  private String login;
  private String clave;
  private Character estado;

  // private Set rolusuarios = new HashSet(0);
  // private Set usuariodocentes = new HashSet(0);
  // private Set usuarioalumnos = new HashSet(0);

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public Character getEstado() {
    return estado;
  }

  public void setEstado(Character estado) {
    this.estado = estado;
  }

}
