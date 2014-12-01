package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;
import dev.com.matricula.service.ConsultaCursosService;

@Service
public class ConsultaCursosServiceImpl implements ConsultaCursosService {

  @Autowired
  private AsignacionDao asignacionDao;

  @Override
  public List<Asignacion> obtenerCursosAlumno(int codigo) {
    return asignacionDao.obtenerAsignacionAlumno(codigo);
  }

}
