package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.HorarioDao;
import dev.com.matricula.model.Horario;

@Repository
public class HorarioDaoImpl extends AbstractHibernateDao implements HorarioDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Horario> obtenerHorarioConDatos() {
		abrirSesion();
		List<Horario> horarios;
		StringBuilder hql = new StringBuilder(" select hor from Horario hor ");
		hql.append(" inner join fetch hor.aula aula ");
		hql.append(" inner join fetch hor.asignacion asig ");

		Query query = session.createQuery(hql.toString());
		horarios = query.list();

		return horarios;
	}

}
