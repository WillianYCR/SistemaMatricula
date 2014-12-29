package dev.com.matricula.dto;

import dev.com.matricula.model.Rol;
import dev.com.matricula.util.Consola;

public class RolDTO {

	private Integer id;
	private String descripcion;
	private Character estado;

	public RolDTO() {
	}

	public RolDTO(Rol rol) {
		if (rol != null) {
			this.id = rol.getIdRol();
			this.descripcion = rol.getDescripcion();
			this.estado = rol.getEstado();
		} else {
			Consola.objetoNull(Rol.class.getName());
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}
