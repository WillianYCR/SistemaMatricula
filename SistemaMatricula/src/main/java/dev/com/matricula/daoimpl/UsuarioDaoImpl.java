package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractHibernateDao implements UsuarioDao {

  private int entero;
  private String ID_USUARIO = "idUsuario";
  private String LOGIN_USUARIO = "login";
  private String CLAVE_USUARIO = "clave";
  private Usuario usuario;
  private List<Usuario> usuarioList;

  @Override
  public boolean registrarUsuario(Usuario usuario) {
    try {
      iniciarTransaccion();
      session.saveOrUpdate(usuario);
      commitearCerrarTransaccion();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdUsuario() {
    abrirSesion();
    query = session.createSQLQuery("select max(idusuario+1) from Usuario");
    entero = Integer.parseInt(query.uniqueResult().toString());
    cerrarSesion();
    return entero;
  }

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String loginUsuario) {
    iniciarTransaccion();
    criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq(LOGIN_USUARIO, loginUsuario));
    usuario = (Usuario) criteria.uniqueResult();
    cerrarSesion();
    return usuario;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Usuario> obtenerUsuario() {
    iniciarTransaccion();
    criteria = session.createCriteria(Usuario.class);
    usuarioList = criteria.list();
    cerrarSesion();
    return usuarioList;
  }

  @Override
  public String obtenerLoginUsuario(int idUsuario) {
    iniciarTransaccion();
    criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq(ID_USUARIO, idUsuario));
    String login = ((Usuario) criteria.uniqueResult()).getLogin();
    cerrarSesion();
    return login;
  }
}
