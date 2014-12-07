package dev.com.matricula.daoimpl;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.AulaDao;
import dev.com.matricula.model.Aula;

@Repository
public class AulaDaoImpl extends AbstractHibernateDao implements AulaDao {

  @Override
  public boolean persistirAula(Aula aula) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(aula);
      commitearCerrarTransaccion();
      return true;
    } catch (HibernateException e) {
      return false;
    }
  }

}
