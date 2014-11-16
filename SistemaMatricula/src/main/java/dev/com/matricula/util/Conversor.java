package dev.com.matricula.util;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Hibernate;

import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.dto.RolDTO;
import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;

public class Conversor {

  // Obtiene el dto de la entidad
  public static AlumnoDTO obtenerAlumnoDTO(Alumno alumno) {

    if (alumno == null) {
      Consola.objetoNull(Alumno.class.getName());
      return null;
    }

    AlumnoDTO dto = new AlumnoDTO();
    dto.setId(alumno.getIdAlumno());
    dto.setDni(alumno.getDni());
    dto.setApellidoPaterno(alumno.getApellidoPaterno());
    dto.setApellidoMaterno(alumno.getApellidoMaterno());
    dto.setNombres(alumno.getNombre());
    dto.setFechaNacimiento(alumno.getFechaNacimiento());
    dto.setSexo(alumno.getSexo());
    dto.setEmail(alumno.getEmail());
    dto.setTelefono(alumno.getTelefono());
    return dto;
  }

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

  public static List<AlumnoDTO> obtenerListaAlumnosDTO(List<Alumno> alumnoLista) {

    if (alumnoLista == null || alumnoLista.isEmpty()) {
      Consola.listaVaciaONull(Alumno.class.getName());
      return null;
    }

    List<AlumnoDTO> lista = new ArrayList<AlumnoDTO>();

    for (Alumno alum : alumnoLista) {
      lista.add(Conversor.obtenerAlumnoDTO(alum));
    }

    return lista;
  }

  public static UsuarioDTO obtenerUsuarioDTO(Usuario usuario) {
    if (usuario == null) {
      Consola.objetoNull(Usuario.class.getName());
      return null;
    }
    UsuarioDTO dto = new UsuarioDTO();
    dto.setId(usuario.getIdUsuario());
    dto.setDni(usuario.getDni());
    dto.setNombres(usuario.getNombre());
    dto.setLogin(usuario.getLogin());
    dto.setClave(usuario.getClave());
    dto.setEstado(usuario.getEstado());
    return dto;
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

  public static RolDTO obtenerRolDTO(Rol rol) {
    if (rol == null) {
      Consola.objetoNull(Rol.class.getName());
      return null;
    }
    RolDTO dto = new RolDTO();
    dto.setId(rol.getIdRol());
    dto.setDescripcion(rol.getDescripcion());
    dto.setEstado(rol.getEstado());
    return dto;
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

  public static RolUsuarioDTO obtenerRolUsuarioDTO(RolUsuario rolUsuario) {
    if (rolUsuario == null) {
      Consola.objetoNull(RolUsuario.class.getName());
      return null;
    }
    RolUsuarioDTO dto = new RolUsuarioDTO();
    dto.setId(rolUsuario.getIdRolUsuario());
    dto.setEstado(rolUsuario.getEstado());
//    if(Hibernate.isInitialized(rolUsuario.getRol())){
//      dto.setRol(obtenerRolDTO(rolUsuario.getRol()));  
//    }
    dto.setRol(obtenerRolDTO(rolUsuario.getRol()));
    dto.setUsuario(obtenerUsuarioDTO(rolUsuario.getUsuario()));
    return dto;
  }

  public static UsuarioAlumnoDTO obtenerUsuarioAlumnoDTO(UsuarioAlumno usuarioAlumno) {
    if (usuarioAlumno == null) {
      Consola.objetoNull(UsuarioAlumno.class.getName());
      return null;
    }
    UsuarioAlumnoDTO dto = new UsuarioAlumnoDTO();
    dto.setId(usuarioAlumno.getIdUsuarioAlumno());
    dto.setAlumno(obtenerAlumnoDTO(usuarioAlumno.getAlumno()));
    dto.setUsuario(obtenerUsuarioDTO(usuarioAlumno.getUsuario()));
    dto.setEstado(usuarioAlumno.getEstado());
    return dto;
  }

  public static List<UsuarioAlumnoDTO> obtenerListaUsuarioAlumnoDTO(List<UsuarioAlumno> lista) {
    if (lista == null || lista.isEmpty()) {
      Consola.listaVaciaONull(UsuarioAlumno.class.getName());
      return null;
    }
    List<UsuarioAlumnoDTO> listaDTO = new ArrayList<UsuarioAlumnoDTO>();
    for (UsuarioAlumno usuarioAlumno : lista) {
      listaDTO.add(obtenerUsuarioAlumnoDTO(usuarioAlumno));
    }
    return listaDTO;
  }

}
