package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.Alumno;

public interface AlumnoService {

	public List<Alumno> listarAlumno();

	boolean registrarAlumno(Alumno alumno);

}
