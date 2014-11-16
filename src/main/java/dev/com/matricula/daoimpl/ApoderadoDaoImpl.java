package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.model.Apoderado;

public class ApoderadoDaoImpl extends AbstractHibernateDao implements ApoderadoDao {

  private int entero;
  private String CODIGO_ALUMNO = "idAlumno";
  private Apoderado apoderado;
  private List<Apoderado> apoderadoList;

  public boolean registrarApoderado(Apoderado apoderado) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(apoderado);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Integer obtenerUltimoIdApoderado() {
    iniciarTransaccion();
    query = session.createSQLQuery("select max(idapoderado+1) from Apoderado");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  public Apoderado obtenerDatoApoderado(int codigoApoderado) {
    iniciarTransaccion();
    criteria = session.createCriteria(Apoderado.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoApoderado));
    apoderado = (Apoderado) criteria.uniqueResult();
    cerrarSesion();
    return apoderado;
  }

  @SuppressWarnings("unchecked")
  public List<Apoderado> obtenerApoderados() {
    abrirSesion();
    criteria = session.createCriteria(Apoderado.class);
    apoderadoList = criteria.list();
    cerrarSesion();
    return apoderadoList;
  }
}
