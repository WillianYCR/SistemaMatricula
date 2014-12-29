package dev.com.matricula.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dev.com.matricula.dao.DocenteDao;
import dev.com.matricula.dao.HorarioDao;
import dev.com.matricula.model.Docente;
import dev.com.matricula.model.Horario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/application-context.xml")
public class TestViewQuery {

	@Autowired
	private DocenteDao docenteDao;

	@Autowired
	private HorarioDao horarioDao;

	@Test
	public void obtenerAlgunosDatosDeDocente() {
		List<Docente> docentes = docenteDao.obtenerAlgunosDatosDocente();
		Assert.assertNotNull(docentes);
	}

	@Test
	public void obtenerHorarios() {
		List<Horario> horarios = horarioDao.obtenerHorarioConDatos();
		Assert.assertNotNull(horarios);
	}

}
