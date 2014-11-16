package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.model.Notas;
import dev.com.matricula.service.ConsultaNotaService;

public class ConsultaNotaServiceImpl implements ConsultaNotaService {

  private NotasDao notasDao;

  public List<Notas> obtenerNotasAlumno(int codigo) {
    return notasDao.obtenerNotasAlumno(codigo);
  }

  public void setNotasDao(NotasDao notasDao) {
    this.notasDao = notasDao;
  }
}
