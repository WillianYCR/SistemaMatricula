package dev.com.matricula.dto;

import java.util.Date;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.util.Consola;

public class MatriculaDTO {

	private Integer idMatricula;
	private String nombreColegio;
	private AlumnoDTO alumnoDTO;
	private String nombreApoderado;
	private String nombreCompletoApoderado;
	private String nombreAnhoEscolar;
	private Date fechaMatricula;
	private String nivel;
	private String grado;
	private char seccion;
	private char turno;
	private String nombreTurno;
	private String situacion;
	private char estado;
	private String NombreEstado;
	private String observacion;

	public MatriculaDTO() {
	}

	public MatriculaDTO(Matricula matricula) {
		if (matricula != null) {
			this.idMatricula = matricula.getIdMatricula();
			this.nombreColegio = matricula.getColegio().getNombre();
			this.alumnoDTO = new AlumnoDTO(matricula.getAlumno());
			this.nombreApoderado = matricula.getApoderado().getNombre();
			this.nombreCompletoApoderado = matricula.getApoderado().getNombre()
					+ " " + matricula.getApoderado().getApellidoPaterno() + " "
					+ matricula.getApoderado().getApellidoMaterno();
			this.nombreAnhoEscolar = matricula.getAnhoEscolar()
					.getIdAnhoEscolar();
			this.fechaMatricula = matricula.getFechaMatricula();
			this.nivel = matricula.getNivel();
			this.grado = matricula.getGrado();
			this.seccion = matricula.getSeccion();
			this.turno = matricula.getTurno();
			this.nombreTurno = String.valueOf(matricula.getTurno());
			this.situacion = matricula.getSituacion();
			this.estado = matricula.getEstado();
			this.NombreEstado = String.valueOf(matricula.getEstado());
			this.observacion = matricula.getObservacion();
		} else {
			Consola.objetoNull(Alumno.class.getName());
		}
	}

	public Integer getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Integer idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public AlumnoDTO getAlumno() {
		return alumnoDTO;
	}

	public void setAlumno(AlumnoDTO alumnoDTO) {
		this.alumnoDTO = alumnoDTO;
	}

	public String getNombreApoderado() {
		return nombreApoderado;
	}

	public void setNombreApoderado(String nombreApoderado) {
		this.nombreApoderado = nombreApoderado;
	}

	public String getNombreCompletoApoderado() {
		return nombreCompletoApoderado;
	}

	public void setNombreCompletoApoderado(String nombreCompletoApoderado) {
		this.nombreCompletoApoderado = nombreCompletoApoderado;
	}

	public String getNombreAnhoEscolar() {
		return nombreAnhoEscolar;
	}

	public void setNombreAnhoEscolar(String nombreAnhoEscolar) {
		this.nombreAnhoEscolar = nombreAnhoEscolar;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public char getSeccion() {
		return seccion;
	}

	public void setSeccion(char seccion) {
		this.seccion = seccion;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public String getNombreTurno() {
		return nombreTurno;
	}

	public void setNombreTurno(String nombreTurno) {
		this.nombreTurno = nombreTurno;
	}

	public String getSituacion() {
		return situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getNombreEstado() {
		return NombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		NombreEstado = nombreEstado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
