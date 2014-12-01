package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.MatriculaDao;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.service.ConsultaAlumnoService;

@Service
public class ConsultaAlumnoServiceImpl implements ConsultaAlumnoService {

  @Autowired
  private MatriculaDao matriculaDao;

  @Override
  public List<Matricula> obtenerMatriculaAlumno(int codigo) {
    return matriculaDao.obtenerMatriculaAlumno(codigo);
  }

}
