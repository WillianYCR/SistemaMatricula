package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;

public class AsignacionDaoImpl extends AbstractHibernateDao implements AsignacionDao {

  private int entero;
  private String CODIGO_ANHOESCOLAR = "anhoEscolar.idAnhoEscolar";
  private List<Asignacion> asignacionList;

  public boolean registrarAsignacion(Asignacion asignacion) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(asignacion);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Integer obtenerUltimoIdAsignacion() {
    abrirSesion();
    query = session.createSQLQuery("select max(idasignacion+1) from AsignacionDTO");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @SuppressWarnings("unchecked")
  public List<Asignacion> obtenerAsignaciones() {
    abrirSesion();
    criteria = session.createCriteria(Asignacion.class);
    asignacionList = criteria.list();
    cerrarSesion();
    return asignacionList;
  }

  @SuppressWarnings("unchecked")
  public List<Asignacion> obtenerAsignacionAlumno(int codigoAnhoEscolar) {
    abrirSesion();
    criteria = session.createCriteria(Asignacion.class);
    criteria.add(Restrictions.eq(CODIGO_ANHOESCOLAR, "2013"));
    asignacionList = criteria.list();
    // cerrarSesion();
    return asignacionList;
  }

}
