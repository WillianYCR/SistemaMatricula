package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.MatriculaDao;
import dev.com.matricula.model.Matricula;

@Repository
public class MatriculaDaoImpl extends AbstractHibernateDao implements MatriculaDao {

  private int entero;
  private String CODIGO_ANHOESCOLAR = "anhoEscolar.idAnhoEscolar";
  private List<Matricula> matriculaList;

  @Override
  public boolean registrarMatricula(Matricula matricula) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(matricula);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdMatricula() {
    abrirSesion();
    query = session.createSQLQuery("select max(idmatricula+1) from MatriculaDTO");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Matricula> obtenerMatriculas() {
    abrirSesion();
    criteria = session.createCriteria(Matricula.class);
    matriculaList = criteria.list();
    cerrarSesion();
    return matriculaList;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Matricula> obtenerMatriculaAlumno(int codigoAnhoEscolar) {
    abrirSesion();
    criteria = session.createCriteria(Matricula.class);
    criteria.add(Restrictions.eq(CODIGO_ANHOESCOLAR, "2013"));
    matriculaList = criteria.list();
    // cerrarSesion();
    return matriculaList;
  }
}
