package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.DocenteDao;
import dev.com.matricula.model.Docente;

@Repository
public class DocenteDaoImpl extends AbstractHibernateDao implements DocenteDao {

	private List<Docente> docenteList;

	@Override
	@SuppressWarnings("unchecked")
	public List<Docente> listarDocente() {
		abrirSesion();
		criteria = session.createCriteria(Docente.class);
		docenteList = criteria.list();
		cerrarSesion();
		return docenteList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Docente> obtenerAlgunosDatosDocente() {
		abrirSesion();
		List<Docente> docentes;
		criteria = session.createCriteria(Docente.class);
		criteria.setProjection(Projections.property("nombre").as("nombre"));
		criteria.setResultTransformer(Transformers.aliasToBean(Docente.class));
		docentes = criteria.list();
		cerrarSesion();
		return docentes;
	}

}
