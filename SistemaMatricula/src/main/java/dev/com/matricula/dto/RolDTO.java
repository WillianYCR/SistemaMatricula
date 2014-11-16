package dev.com.matricula.dto;

public class RolDTO {

  private Integer id;
  private String descripcion;
  private Character estado;

  // private List<Rol> rolusuarios = new HashSet(0);

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Character getEstado() {
    return estado;
  }

  public void setEstado(Character estado) {
    this.estado = estado;
  }

}
