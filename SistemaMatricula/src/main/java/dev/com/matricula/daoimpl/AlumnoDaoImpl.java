package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;

public class AlumnoDaoImpl extends AbstractHibernateDao implements AlumnoDao {

  private int entero;
  private String CODIGO_ALUMNO = "idAlumno";
  private Alumno alumno;
  private List<Alumno> alumnoList;

  public boolean registrarAlumno(Alumno alumno) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(alumno);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Integer obtenerUltimoIdAlumno() {
    abrirSesion();
    query = session.createSQLQuery("select max(idalumno+1) from AlumnoDTO");
    entero = Integer.parseInt(query.uniqueResult().toString());
    return entero;
  }

  public Alumno obtenerDatoAlumno(int codigoAlumno) {
    iniciarTransaccion();
    criteria = session.createCriteria(Alumno.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoAlumno));
    alumno = (Alumno) criteria.uniqueResult();
    cerrarSesion();
    return alumno;
  }

  @SuppressWarnings("unchecked")
  public List<Alumno> obtenerAlumnos() {
    abrirSesion();
    criteria = session.createCriteria(Alumno.class);
    alumnoList = criteria.list();
    cerrarSesion();
    return alumnoList;
  }
  
  public List<Alumno> listarAlumnosAula() {
    abrirSesion();
    criteria = session.createCriteria(Alumno.class);
    alumnoList = criteria.list();
    cerrarSesion();
    return alumnoList;
  }
}
