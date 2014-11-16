package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaAlumnosAulaService;
import dev.com.matricula.util.Conversor;

public class ConsultaAlumnosAulaServiceImpl implements ConsultaAlumnosAulaService {

  private AlumnoDao alumnoDao;

  public List<AlumnoDTO> listarAlumnosAula() {
    List<Alumno> alumnoLista = alumnoDao.listarAlumnosAula();
    return Conversor.obtenerListaAlumnosDTO(alumnoLista);
  }
  
  //public List<Alumno> listarAlumnosAula() {
  //  return alumnoDao.listarAlumnosAula();
  //}

  public void setAlumnoDao(AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
  }

}
