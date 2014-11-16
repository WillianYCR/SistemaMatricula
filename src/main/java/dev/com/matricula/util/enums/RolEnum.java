package dev.com.matricula.util.enums;

public enum RolEnum {

  ALUMNO(1, "Alumno"), APODERADO(2, "Apoderado"), DOCENTE(3, "Docente"), MATRICULANTE(4,
      "Matriculante"), ADMINISTRADOR(5, "Administrador");

  private Integer codigo;
  private String descripcion;

  RolEnum(Integer codigo, String descripcion) {
    this.codigo = codigo;
    this.descripcion = descripcion;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

}
