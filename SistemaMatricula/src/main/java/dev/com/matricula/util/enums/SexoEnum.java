package dev.com.matricula.util.enums;

public enum SexoEnum {

  MASCULINO('M', "Masculino"), FEMENINO('F', "Femenino");

  private char codigo;
  private String descripcion;

  SexoEnum(char codigo, String descripcion) {
    this.codigo = codigo;
    this.descripcion = descripcion;
  }

  public char getCodigo() {
    return codigo;
  }

  public void setCodigo(char codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

}
