package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.UsuarioAlumnoService;

@Service
public class UsuarioAlumnoServiceImpl implements UsuarioAlumnoService {

	@Autowired
	private UsuarioAlumnoDao usuarioAlumnoDao;

	@Override
	public List<UsuarioAlumnoDTO> obtenerListaAlumnosRelacionados(
			Integer idUsuario) {
		List<UsuarioAlumno> usuarioAlumnoList = usuarioAlumnoDao
				.obtenerListaAlumnosRelacionados(idUsuario);
		return new UsuarioAlumnoDTO().listaUsuarioAlumnoDTO(usuarioAlumnoList);
	}

}
