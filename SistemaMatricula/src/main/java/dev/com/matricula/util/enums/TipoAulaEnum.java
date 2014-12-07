package dev.com.matricula.util.enums;

public enum TipoAulaEnum {

  SALON(1, "Salón de clases"), LABORATORIO(2, "Laboratorio");

  private Integer codigo;
  private String descripcion;

  TipoAulaEnum(Integer codigo, String descripcion) {
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
