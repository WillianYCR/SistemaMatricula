package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaAlumnosAulaService;

@Service
public class ConsultaAlumnosAulaServiceImpl implements
		ConsultaAlumnosAulaService {

	@Autowired
	private AlumnoDao alumnoDao;

	@Override
	public List<AlumnoDTO> listarAlumnosAula() {
		List<Alumno> alumnoLista = alumnoDao.listarAlumnosAula();
		return new AlumnoDTO().listaAlumnoDTO(alumnoLista);
	}

	// public List<Alumno> listarAlumnosAula() {
	// return alumnoDao.listarAlumnosAula();
	// }

}
