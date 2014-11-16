package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;

public class AlumnoServiceImpl implements AlumnoService {

  private AlumnoDao alumnoDao;

  public boolean registrarAlumno(Alumno alumno) {
    return alumnoDao.registrarAlumno(alumno);
  }

  public void setAlumnoDao(AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
  }


}
