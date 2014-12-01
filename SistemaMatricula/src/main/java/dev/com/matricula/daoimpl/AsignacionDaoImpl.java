package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;

@Repository
public class AsignacionDaoImpl extends AbstractHibernateDao implements AsignacionDao {

  private int entero;
  private String CODIGO_ANHOESCOLAR = "anhoEscolar.idAnhoEscolar";
  private List<Asignacion> asignacionList;

  @Override
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

  @Override
  public Integer obtenerUltimoIdAsignacion() {
    abrirSesion();
    query = session.createSQLQuery("select max(idasignacion+1) from AsignacionDTO");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Asignacion> obtenerAsignaciones() {
    abrirSesion();
    criteria = session.createCriteria(Asignacion.class);
    asignacionList = criteria.list();
    cerrarSesion();
    return asignacionList;
  }

  @Override
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
