package dev.com.matricula.dto;

import dev.com.matricula.model.Asignacion;
import dev.com.matricula.util.Consola;

public class AsignacionDTO {

	private Integer idAsignacion;
	private String nombreDocente;
	private String nombreCurso;
	private String NombreAnhoEscolar;
	private Double horasTeoricas;
	private Double horasPracticas;
	private String nivel;
	private String nombreNivel;
	private String grado;
	private String nombreGrado;
	private char seccion;

	public AsignacionDTO() {
	}

	public AsignacionDTO(Asignacion asignacion) {
		if (asignacion != null) {
			this.idAsignacion = asignacion.getIdAsignacion();
			this.nombreDocente = asignacion.getDocente().getNombre();
			this.nombreCurso = asignacion.getCurso().getDescripcion();
			this.NombreAnhoEscolar = asignacion.getAnhoEscolar()
					.getIdAnhoEscolar();
			this.horasTeoricas = Double.parseDouble(String.valueOf(asignacion
					.getHorasTeoricas()));
			this.horasPracticas = Double.parseDouble(String.valueOf(asignacion
					.getHorasPracticas()));
			this.nivel = asignacion.getNivel();
			this.nombreNivel = asignacion.getNivel();
			this.grado = asignacion.getGrado();
			this.nombreGrado = asignacion.getGrado();
			this.seccion = asignacion.getSeccion();
		} else {
			Consola.objetoNull(Asignacion.class.getName());
		}
	}

	public Integer getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(Integer idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreAnhoEscolar() {
		return NombreAnhoEscolar;
	}

	public void setNombreAnhoEscolar(String nombreAnhoEscolar) {
		NombreAnhoEscolar = nombreAnhoEscolar;
	}

	public Double getHorasTeoricas() {
		return horasTeoricas;
	}

	public void setHorasTeoricas(Double horasTeoricas) {
		this.horasTeoricas = horasTeoricas;
	}

	public Double getHorasPracticas() {
		return horasPracticas;
	}

	public void setHorasPracticas(Double horasPracticas) {
		this.horasPracticas = horasPracticas;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getNombreNivel() {
		return nombreNivel;
	}

	public void setNombreNivel(String nombreNivel) {
		this.nombreNivel = nombreNivel;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getNombreGrado() {
		return nombreGrado;
	}

	public void setNombreGrado(String nombreGrado) {
		this.nombreGrado = nombreGrado;
	}

	public char getSeccion() {
		return seccion;
	}

	public void setSeccion(char seccion) {
		this.seccion = seccion;
	}

}
