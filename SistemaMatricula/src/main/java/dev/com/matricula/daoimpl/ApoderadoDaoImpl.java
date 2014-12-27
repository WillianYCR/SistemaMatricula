package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.model.Apoderado;

@Repository
public class ApoderadoDaoImpl extends AbstractHibernateDao implements
		ApoderadoDao {

	private int entero;
	private String CODIGO_ALUMNO = "idAlumno";
	private Apoderado apoderado;
	private List<Apoderado> apoderadoList;

	@Override
	public boolean registrarApoderado(Apoderado apoderado) {
		try {
			iniciarTransaccion();
			session.saveOrUpdate(apoderado);
			commitearCerrarTransaccion();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Integer obtenerUltimoIdApoderado() {
		iniciarTransaccion();
		query = session
				.createSQLQuery("select max(idapoderado+1) from Apoderado");
		entero = Integer.parseInt(query.uniqueResult().toString());
		cerrarSesion();
		return entero;
	}

	@Override
	public Apoderado obtenerDatoApoderado(int codigoApoderado) {
		iniciarTransaccion();
		criteria = session.createCriteria(Apoderado.class);
		criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoApoderado));
		apoderado = (Apoderado) criteria.uniqueResult();
		cerrarSesion();
		return apoderado;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Apoderado> obtenerApoderados() {
		abrirSesion();
		criteria = session.createCriteria(Apoderado.class);
		apoderadoList = criteria.list();
		cerrarSesion();
		return apoderadoList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Apoderado> listarApoderado() {
		abrirSesion();
		criteria = session.createCriteria(Apoderado.class);
		apoderadoList = criteria.list();
		cerrarSesion();
		return apoderadoList;
	}
}
