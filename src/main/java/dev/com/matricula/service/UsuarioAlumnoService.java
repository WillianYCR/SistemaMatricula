package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.dto.UsuarioAlumnoDTO;

public interface UsuarioAlumnoService {

  List<UsuarioAlumnoDTO> obtenerListaAlumnosRelacionados(Integer idUsuario);

}
