package dev.com.matricula.dto;

import java.util.ArrayList;
import java.util.List;

import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.util.Consola;

public class UsuarioAlumnoDTO {

	private Integer id;
	private AlumnoDTO alumno;
	private UsuarioDTO usuario;
	private Character estado;

	public UsuarioAlumnoDTO() {
	}

	public UsuarioAlumnoDTO(UsuarioAlumno usuarioAlumno) {
		if (usuarioAlumno != null) {
			this.id = usuarioAlumno.getIdUsuarioAlumno();
			this.alumno = new AlumnoDTO(usuarioAlumno.getAlumno());
			this.usuario = new UsuarioDTO(usuarioAlumno.getUsuario());
			this.estado = usuarioAlumno.getEstado();
		} else {
			Consola.objetoNull(UsuarioAlumno.class.getName());
		}
	}

	public List<UsuarioAlumnoDTO> listaUsuarioAlumnoDTO(
			List<UsuarioAlumno> usuarioAlumnoLista) {
		List<UsuarioAlumnoDTO> usuarioAlumnolistaDto = new ArrayList<UsuarioAlumnoDTO>();
		// TODO: Es valido comparar con null ?
		if (usuarioAlumnoLista == null || usuarioAlumnoLista.isEmpty()) {
			for (UsuarioAlumno usuarioAlumno : usuarioAlumnoLista) {
				usuarioAlumnolistaDto.add(new UsuarioAlumnoDTO(usuarioAlumno));
			}
		} else {
			Consola.listaVaciaONull(UsuarioAlumno.class.getName());
		}
		return usuarioAlumnolistaDto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AlumnoDTO getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoDTO alumno) {
		this.alumno = alumno;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}
