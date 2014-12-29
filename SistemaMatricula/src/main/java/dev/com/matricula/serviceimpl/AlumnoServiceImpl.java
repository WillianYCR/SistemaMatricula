package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDao alumnoDao;

	@Override
	public boolean registrarAlumno(Alumno alumno) {
		return alumnoDao.registrarAlumno(alumno);
	}

	@Override
	public List<Alumno> listarAlumno() {
		return alumnoDao.listarAlumno();
	}

}
