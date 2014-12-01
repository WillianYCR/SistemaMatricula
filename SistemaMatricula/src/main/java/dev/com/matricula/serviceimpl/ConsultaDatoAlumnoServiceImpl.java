package dev.com.matricula.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.util.Conversor;

@Service
public class ConsultaDatoAlumnoServiceImpl implements ConsultaDatoAlumnoService {

  @Autowired
  private AlumnoDao alumnoDao;

  @Override
  public AlumnoDTO obtenerDatoAlumno(int codigo) {
    Alumno alumno = alumnoDao.obtenerDatoAlumno(codigo);
    return Conversor.obtenerAlumnoDTO(alumno);
  }

}
