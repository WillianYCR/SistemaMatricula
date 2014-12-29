package dev.com.matricula.dto;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.util.Consola;

public class RolUsuarioDTO {

	private Integer id;
	private UsuarioDTO usuario;
	private RolDTO rol;
	private Character estado;

	public RolUsuarioDTO() {
	}

	public RolUsuarioDTO(RolUsuario rolUsuario) {
		if (rolUsuario != null) {
			this.id = rolUsuario.getIdRolUsuario();
			this.usuario = new UsuarioDTO(rolUsuario.getUsuario());
			this.rol = new RolDTO(rolUsuario.getRol());
			this.estado = rolUsuario.getEstado();
		} else {
			Consola.objetoNull(RolUsuario.class.getName());
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public RolDTO getRol() {
		return rol;
	}

	public void setRol(RolDTO rol) {
		this.rol = rol;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}
