package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.model.Apoderado;
import dev.com.matricula.service.ApoderadoService;

@Service
public class ApoderadoServiceImpl implements ApoderadoService {

	@Autowired
	private ApoderadoDao apoderadoDao;


	@Override
	public List<Apoderado> listarApoderado() {
		return apoderadoDao.listarApoderado();
	}

}