package dev.com.matricula.model;

// Generated 27/04/2014 12:29:47 AM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Notas generated by hbm2java
 */
public class Notas implements java.io.Serializable {

  private Integer idNotas;
  private Alumno alumno;
  private Asignacion asignacion;
  private BigDecimal b1;
  private BigDecimal b2;
  private BigDecimal b3;
  private BigDecimal b4;
  private BigDecimal promedio;
  private String usuarioInscripcion;
  private Date fechaInscripcion;
  private String usuarioModificacion;
  private Date fechaModificacion;

  public Notas() {
  }

  public Notas(Alumno alumno, Asignacion asignacion, BigDecimal b1, BigDecimal b2, BigDecimal b3,
          BigDecimal b4, BigDecimal promedio) {
    this.alumno = alumno;
    this.asignacion = asignacion;
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
  }

  public Notas(Alumno alumno, Asignacion asignacion, BigDecimal b1, BigDecimal b2, BigDecimal b3,
          BigDecimal b4, BigDecimal promedio, String usuarioInscripcion, Date fechaInscripcion,
          String usuarioModificacion, Date fechaModificacion) {
    this.alumno = alumno;
    this.asignacion = asignacion;
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
    this.usuarioInscripcion = usuarioInscripcion;
    this.fechaInscripcion = fechaInscripcion;
    this.usuarioModificacion = usuarioModificacion;
    this.fechaModificacion = fechaModificacion;
  }

  public Integer getIdNotas() {
    return this.idNotas;
  }

  public void setIdNotas(Integer idNotas) {
    this.idNotas = idNotas;
  }

  public Alumno getAlumno() {
    return this.alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Asignacion getAsignacion() {
    return this.asignacion;
  }

  public void setAsignacion(Asignacion asignacion) {
    this.asignacion = asignacion;
  }

  public BigDecimal getB1() {
    return this.b1;
  }

  public void setB1(BigDecimal b1) {
    this.b1 = b1;
  }

  public BigDecimal getB2() {
    return this.b2;
  }

  public void setB2(BigDecimal b2) {
    this.b2 = b2;
  }

  public BigDecimal getB3() {
    return this.b3;
  }

  public void setB3(BigDecimal b3) {
    this.b3 = b3;
  }

  public BigDecimal getB4() {
    return this.b4;
  }

  public void setB4(BigDecimal b4) {
    this.b4 = b4;
  }

  public BigDecimal getPromedio() {
    return this.promedio;
  }

  public void setPromedio(BigDecimal promedio) {
    this.promedio = promedio;
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

  public String getUsuarioModificacion() {
    return this.usuarioModificacion;
  }

  public void setUsuarioModificacion(String usuarioModificacion) {
    this.usuarioModificacion = usuarioModificacion;
  }

  public Date getFechaModificacion() {
    return this.fechaModificacion;
  }

  public void setFechaModificacion(Date fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

}
