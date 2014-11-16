package dev.com.matricula.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Alumno implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private Integer idAlumno;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private Date fechaNacimiento;
  private String telefono;
  private String dni;
  private char sexo;
  private String email;
  private String usuarioInscripcion;
  private Date fechaInscripcion;
  private Set usuarioalumnos = new HashSet(0);
  private Set parentescos = new HashSet(0);
  private Set matriculas = new HashSet(0);
  private Set notases = new HashSet(0);

  public Alumno() {
  }

  public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno,
          Date fechaNacimiento, String dni, char sexo) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.dni = dni;
    this.sexo = sexo;
  }

  public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno,
          Date fechaNacimiento, String telefono, String dni, char sexo, String email,
          String usuarioInscripcion, Date fechaInscripcion, Set usuarioalumnos, Set parentescos,
          Set matriculas, Set notases) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.telefono = telefono;
    this.dni = dni;
    this.sexo = sexo;
    this.email = email;
    this.usuarioInscripcion = usuarioInscripcion;
    this.fechaInscripcion = fechaInscripcion;
    this.usuarioalumnos = usuarioalumnos;
    this.parentescos = parentescos;
    this.matriculas = matriculas;
    this.notases = notases;
  }

  public Integer getIdAlumno() {
    return this.idAlumno;
  }

  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return this.apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return this.apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Date getFechaNacimiento() {
    return this.fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public char getSexo() {
    return this.sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public Set getUsuarioalumnos() {
    return this.usuarioalumnos;
  }

  public void setUsuarioalumnos(Set usuarioalumnos) {
    this.usuarioalumnos = usuarioalumnos;
  }

  public Set getParentescos() {
    return this.parentescos;
  }

  public void setParentescos(Set parentescos) {
    this.parentescos = parentescos;
  }

  public Set getMatriculas() {
    return this.matriculas;
  }

  public void setMatriculas(Set matriculas) {
    this.matriculas = matriculas;
  }

  public Set getNotases() {
    return this.notases;
  }

  public void setNotases(Set notases) {
    this.notases = notases;
  }

}
