package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;
import dev.com.matricula.service.ConsultaCursosService;

public class ConsultaCursosServiceImpl implements ConsultaCursosService {

  private AsignacionDao asignacionDao;

  public List<Asignacion> obtenerCursosAlumno(int codigo) {
    return asignacionDao.obtenerAsignacionAlumno(codigo);
  }

  public void setAsignacionDao(AsignacionDao asignacionDao) {
    this.asignacionDao = asignacionDao;
  }
}
