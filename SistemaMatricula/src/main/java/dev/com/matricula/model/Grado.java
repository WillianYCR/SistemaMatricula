package dev.com.matricula.model;

// Generated 27/04/2014 12:29:47 AM by Hibernate Tools 4.0.0

/**
 * Grado generated by hbm2java
 */
public class Grado implements java.io.Serializable {

  private Integer idGrado;
  private String grado;
  private String nivel;

  public Grado() {
  }

  public Grado(String grado, String nivel) {
    this.grado = grado;
    this.nivel = nivel;
  }

  public Integer getIdGrado() {
    return this.idGrado;
  }

  public void setIdGrado(Integer idGrado) {
    this.idGrado = idGrado;
  }

  public String getGrado() {
    return this.grado;
  }

  public void setGrado(String grado) {
    this.grado = grado;
  }

  public String getNivel() {
    return this.nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

}
