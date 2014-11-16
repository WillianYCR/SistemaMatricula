package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.UsuarioAlumnoService;
import dev.com.matricula.util.Conversor;

public class UsuarioAlumnoServiceImpl implements UsuarioAlumnoService {

  private UsuarioAlumnoDao usuarioAlumnoDao;

  public List<UsuarioAlumnoDTO> obtenerListaAlumnosRelacionados(Integer idUsuario) {
    List<UsuarioAlumno> usuarioAlumnoList = usuarioAlumnoDao
        .obtenerListaAlumnosRelacionados(idUsuario);
    return Conversor.obtenerListaUsuarioAlumnoDTO(usuarioAlumnoList);
  }

}
