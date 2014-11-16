package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.model.Notas;

public class NotasDaoImpl extends AbstractHibernateDao implements NotasDao {

  private int entero;
  private String CODIGO_ALUMNO = "alumno.idAlumno";
  private List<Notas> notasList;

  public boolean registrarNotas(Notas notas) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(notas);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Integer obtenerUltimoIdNotas() {
    iniciarTransaccion();
    query = session.createSQLQuery("select max(idnotas+1) from Notas");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  public List<Notas> obtenerNotas() {
    // Ver si se implementa?
    return null;
  }

  @SuppressWarnings("unchecked")
  public List<Notas> obtenerNotasAlumno(int codigoAlumno) {
    iniciarTransaccion();
    criteria = session.createCriteria(Notas.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoAlumno));
    notasList = criteria.list();
    // cerrarSesion();
    return notasList;
  }
}
