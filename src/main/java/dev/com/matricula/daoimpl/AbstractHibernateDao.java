package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDao {

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

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

}
