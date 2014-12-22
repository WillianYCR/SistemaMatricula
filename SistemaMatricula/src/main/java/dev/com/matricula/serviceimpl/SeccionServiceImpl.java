package dev.com.matricula.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.com.matricula.dao.SeccionDao;
import dev.com.matricula.model.Seccion;
import dev.com.matricula.service.SeccionService;

@Service
public class SeccionServiceImpl implements SeccionService {

	@Autowired
	private SeccionDao seccionDao;

	@Override
	public List<Seccion> listarSeccion() {
		return seccionDao.listarSeccion();
	}

}
