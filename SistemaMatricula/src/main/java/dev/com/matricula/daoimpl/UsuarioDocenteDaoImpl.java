package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.UsuarioDocenteDao;
import dev.com.matricula.model.UsuarioDocente;

@Repository
public class UsuarioDocenteDaoImpl extends AbstractHibernateDao implements UsuarioDocenteDao {

  private int entero;
  private String CODIGO_USUARIO = "idUsuario";
  private List<UsuarioDocente> usuarioDocenteList;

  @Override
  public boolean registrarUsuarioDocente(UsuarioDocente usuarioDocente) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(usuarioDocente);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdUsuarioDocente() {
    abrirSesion();
    query = session.createSQLQuery("select max(idusuariodocente+1) from UsuarioDocente");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<UsuarioDocente> obtenerUsuarioDocentes() {
    abrirSesion();
    criteria = session.createCriteria(UsuarioDocente.class);
    usuarioDocenteList = criteria.list();
    cerrarSesion();
    return usuarioDocenteList;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<UsuarioDocente> obtenerIdDocente(int codigoUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(UsuarioDocente.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioDocenteList = criteria.list();
    session.close();
    return usuarioDocenteList;
  }

}
