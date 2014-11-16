package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.MatriculaDao;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.service.ConsultaAlumnoService;

public class ConsultaAlumnoServiceImpl implements ConsultaAlumnoService {

  private MatriculaDao matriculaDao;

  public List<Matricula> obtenerMatriculaAlumno(int codigo) {
    return matriculaDao.obtenerMatriculaAlumno(codigo);
  }

  public void setMatriculaDao(MatriculaDao matriculaDao) {
    this.matriculaDao = matriculaDao;
  }

}
