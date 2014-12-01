package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractHibernateDao {

  @Autowired
  private SessionFactory sessionFactory;
  protected Session session;
  protected Criteria criteria;
  protected Query query;

  protected void abrirSesion() {
    session = getSessionFactory().openSession();
  }

  protected void cerrarSesion() {
    session.close();
  }

  protected void iniciarTransaccion() {
    abrirSesion();
    session.beginTransaction();
  }

  protected void commitearTransaccion() {
    session.beginTransaction().commit();
  }

  protected void commitearCerrarTransaccion() {
    commitearTransaccion();
    cerrarSesion();
  }

  public final Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

}
