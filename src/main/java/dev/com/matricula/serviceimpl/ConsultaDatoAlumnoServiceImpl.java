package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.util.Conversor;

public class ConsultaDatoAlumnoServiceImpl implements ConsultaDatoAlumnoService {

  private AlumnoDao alumnoDao;

  public AlumnoDTO obtenerDatoAlumno(int codigo) {
    Alumno alumno = alumnoDao.obtenerDatoAlumno(codigo);
    return Conversor.obtenerAlumnoDTO(alumno);
  }

  public void setAlumnoDao(AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
  }

}
