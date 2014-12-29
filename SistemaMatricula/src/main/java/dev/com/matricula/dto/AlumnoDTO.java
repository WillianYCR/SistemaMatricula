package dev.com.matricula.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.util.Consola;
import dev.com.matricula.util.enums.SexoEnum;

public class AlumnoDTO {

	private Integer id;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String telefono;
	private String dni;
	private char sexo;
	private String email;

	public AlumnoDTO() {
	}

	public AlumnoDTO(Alumno alumno) {
		if (alumno != null) {
			this.id = alumno.getIdAlumno();
			this.nombres = alumno.getNombre();
			this.apellidoPaterno = alumno.getApellidoPaterno();
			this.apellidoMaterno = alumno.getApellidoMaterno();
			this.fechaNacimiento = alumno.getFechaNacimiento();
			this.telefono = alumno.getTelefono();
			this.dni = alumno.getDni();
			this.sexo = alumno.getSexo();
			this.email = alumno.getEmail();
		} else {
			Consola.objetoNull(Alumno.class.getName());
		}
	}

	public List<AlumnoDTO> listaAlumnoDTO(List<Alumno> alumnoLista) {
		List<AlumnoDTO> alumnolistaDto = new ArrayList<AlumnoDTO>();
		// TODO: Es valido comparar con null ?
		if (alumnoLista == null || alumnoLista.isEmpty()) {
			for (Alumno alumno : alumnoLista) {
				alumnolistaDto.add(new AlumnoDTO(alumno));
			}
		} else {
			Consola.listaVaciaONull(Alumno.class.getName());
		}
		return alumnolistaDto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombre) {
		this.nombres = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreCompleto() {
		return nombres + " " + apellidoPaterno + " " + apellidoPaterno;
	}

	public String getNombreSexo() {
		for (SexoEnum temp : SexoEnum.values()) {
			if (sexo == temp.getCodigo()) {
				return temp.getDescripcion();
			}
		}
		return "";
	}

}
