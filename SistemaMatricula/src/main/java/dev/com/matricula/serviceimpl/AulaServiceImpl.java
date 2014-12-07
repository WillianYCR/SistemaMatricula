package dev.com.matricula.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.AulaDao;
import dev.com.matricula.model.Aula;
import dev.com.matricula.service.AulaService;

@Service
public class AulaServiceImpl implements AulaService {

  @Autowired
  private AulaDao aulaDao;

  @Override
  public boolean registrarAula(Aula aula) {
    return aulaDao.persistirAula(aula);
  }

}
