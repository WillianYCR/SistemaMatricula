package dev.com.matricula.util;

import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.dto.RolDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.Usuario;

public class Conversor {

	// Obtiene la entidad del dto
	public static Alumno obtenerAlumnoDeDTO(AlumnoDTO dto) {
		if (dto == null) {
			Consola.objetoNull(AlumnoDTO.class.getName());
			return null;
		}

		Alumno alumno = new Alumno();
		alumno.setIdAlumno(dto.getId());
		alumno.setDni(dto.getDni());
		alumno.setApellidoPaterno(dto.getApellidoPaterno());
		alumno.setApellidoMaterno(dto.getApellidoMaterno());
		alumno.setNombre(dto.getNombres());
		alumno.setFechaNacimiento(dto.getFechaNacimiento());
		alumno.setSexo(dto.getSexo());
		alumno.setEmail(dto.getEmail());
		alumno.setTelefono(dto.getTelefono());
		return alumno;
	}

	public static Usuario obtenerUsuarioDeDTO(UsuarioDTO dto) {
		if (dto == null) {
			Consola.objetoNull(UsuarioDTO.class.getName());
			return null;
		}
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(dto.getId());
		usuario.setDni(dto.getDni());
		usuario.setNombre(dto.getNombres());
		usuario.setLogin(dto.getLogin());
		usuario.setClave(dto.getClave());
		usuario.setEstado(dto.getEstado());
		return usuario;
	}

	public static Rol obtenerRolDeDTO(RolDTO dto) {
		if (dto == null) {
			Consola.objetoNull(RolDTO.class.getName());
			return null;
		}
		Rol rol = new Rol();
		rol.setIdRol(dto.getId());
		rol.setDescripcion(dto.getDescripcion());
		rol.setEstado(dto.getEstado());
		return rol;
	}

}
