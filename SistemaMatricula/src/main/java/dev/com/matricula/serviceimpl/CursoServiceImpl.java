package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.CursoDao;
import dev.com.matricula.model.Curso;
import dev.com.matricula.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao cursoDao;

	@Override
	public List<Curso> listarCurso() {
		return cursoDao.listarCurso();
	}

}
