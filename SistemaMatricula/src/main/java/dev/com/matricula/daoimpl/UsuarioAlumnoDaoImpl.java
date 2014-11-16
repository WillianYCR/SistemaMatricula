package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.model.UsuarioAlumno;

public class UsuarioAlumnoDaoImpl extends AbstractHibernateDao implements UsuarioAlumnoDao {

  private int entero;
  private String CODIGO_USUARIO = "usuario.idUsuario";
  private String CODIGO_ALUMNO = "alumno.idAlumno";
  private List<UsuarioAlumno> usuarioAlumnolist;

  public boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(usuarioAlumno);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public Integer obtenerUltimoIdUsuarioAlumno() {
    abrirSesion();
    query = session.createSQLQuery("select max(idusuarioalumno+1) from UsuarioAlumno");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @SuppressWarnings("unchecked")
  public List<UsuarioAlumno> obtenerUsuarioAlumnos() {
    iniciarTransaccion();
    criteria = session.createCriteria(UsuarioAlumno.class);
    usuarioAlumnolist = criteria.list();
    cerrarSesion();
    return usuarioAlumnolist;
  }

  @SuppressWarnings("unchecked")
  public List<UsuarioAlumno> obtenerIdAlumno(int codigoUsuario) {
    iniciarTransaccion();
    criteria = session.createCriteria(UsuarioAlumno.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioAlumnolist = criteria.list();
    cerrarSesion();
    return usuarioAlumnolist;
  }

  public Integer obtenerIdUsuarioPorIdAlumno(int idAlumno) {
    iniciarTransaccion();
    criteria = session.createCriteria(UsuarioAlumno.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, idAlumno));
    int idUsuario = ((UsuarioAlumno) criteria.uniqueResult()).getUsuario().getIdUsuario();
    cerrarSesion();
    return idUsuario;
  }

  public List<UsuarioAlumno> obtenerListaAlumnosRelacionados(int codigoUsuario) {
    iniciarTransaccion();
    criteria = session.createCriteria(UsuarioAlumno.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioAlumnolist = criteria.list();
//    cerrarSesion();
    return usuarioAlumnolist;
  }

}
