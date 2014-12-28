package dev.com.matricula.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.DocenteDao;
import dev.com.matricula.model.Docente;

@Repository
public class DocenteDaoImpl extends AbstractHibernateDao implements DocenteDao {

	private List<Docente> docenteList;

	@Override
	public List<Docente> listarDocente() {
		abrirSesion();
		criteria = session.createCriteria(Docente.class);
		docenteList = criteria.list();
		cerrarSesion();
		return docenteList;
	}

}
