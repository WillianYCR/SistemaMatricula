package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.DocenteDao;
import dev.com.matricula.model.Docente;
import dev.com.matricula.service.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteDao docenteDao;

	@Override
	public List<Docente> listarDocente() {
		return docenteDao.listarDocente();
	}

}
