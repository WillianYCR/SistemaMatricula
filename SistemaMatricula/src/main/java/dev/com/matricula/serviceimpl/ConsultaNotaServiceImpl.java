package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.model.Notas;
import dev.com.matricula.service.ConsultaNotaService;

@Service
public class ConsultaNotaServiceImpl implements ConsultaNotaService {

  @Autowired
  private NotasDao notasDao;

  @Override
  public List<Notas> obtenerNotasAlumno(int codigo) {
    return notasDao.obtenerNotasAlumno(codigo);
  }

}
