package dev.com.matricula.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.CursoDao;
import dev.com.matricula.model.Curso;

@Repository
public class CursoDaoImpl extends AbstractHibernateDao implements CursoDao {

	private List<Curso> cursoList;

	@Override
	public List<Curso> listarCurso() {
		abrirSesion();
		criteria = session.createCriteria(Curso.class);
		cursoList = criteria.list();
		cerrarSesion();
		return cursoList;
	}

}
