package dev.com.matricula.dto;

import dev.com.matricula.model.Usuario;
import dev.com.matricula.util.Consola;

public class UsuarioDTO {

	private Integer id;
	private String nombres;
	private String dni;
	private String login;
	private String clave;
	private Character estado;

	public UsuarioDTO() {
	}

	public UsuarioDTO(Usuario usuario) {
		if (usuario != null) {
			this.id = usuario.getIdUsuario();
			this.nombres = usuario.getNombre();
			this.dni = usuario.getDni();
			this.login = usuario.getLogin();
			this.clave = usuario.getClave();
			this.estado = usuario.getEstado();
		} else {
			Consola.objetoNull(Usuario.class.getName());
		}
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

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

}
