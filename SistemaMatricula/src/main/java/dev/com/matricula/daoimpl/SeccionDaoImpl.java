package dev.com.matricula.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.SeccionDao;
import dev.com.matricula.model.Seccion;

@Repository
public class SeccionDaoImpl extends AbstractHibernateDao implements SeccionDao {

	private List<Seccion> aulaList;

	@Override
	public List<Seccion> listarSeccion() {
		abrirSesion();
		criteria = session.createCriteria(Seccion.class);
		aulaList = criteria.list();
		cerrarSesion();
		return aulaList;
	}

}
