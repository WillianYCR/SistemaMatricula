package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.model.RolUsuario;

public class RolUsuarioDaoImpl extends AbstractHibernateDao implements RolUsuarioDao {

  private int entero;
  private String CODIGO_USUARIO = "usuario.idUsuario";
  private RolUsuario rolUsuario;
  private List<RolUsuario> rolUsuarioList;

  public boolean registrarRolUsuario(RolUsuario rolUsuario) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(rolUsuario);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Integer obtenerUltimoIdRolUsuario() {
    abrirSesion();
    query = session.createSQLQuery("select max(idrolusuario+1) from RolUsuario");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  public RolUsuario obtenerDatoRolUsuario(Integer codigoUsuario) {
    iniciarTransaccion();
    criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
//    cerrarSesion();
    return rolUsuario;
  }

  @SuppressWarnings("unchecked")
  public List<RolUsuario> obtenerRolusuarios() {
    abrirSesion();
    criteria = session.createCriteria(RolUsuario.class);
    rolUsuarioList = criteria.list();
    cerrarSesion();
    return rolUsuarioList;
  }

}
