package dev.com.matricula.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dev.com.matricula.model.Aula;
import dev.com.matricula.service.AulaService;
import dev.com.matricula.util.enums.TipoAulaEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/application-context.xml")
public class TestPersistAula {

  @Autowired
  private AulaService aulaService;

  @Test
  public void registrarAula() {
    Aula aula = new Aula();
    short capacidad = 30;
    aula.setCapacidad(capacidad);
    aula.setTipo(TipoAulaEnum.LABORATORIO.getDescripcion());

    boolean fueRegistrado = aulaService.registrarAula(aula);

    Assert.assertTrue(fueRegistrado);
  }

  @Test
  public void editarAulaExistente() {
    Aula aula = new Aula();
    aula.setIdAula(101);
    short capacidad = 20;
    aula.setCapacidad(capacidad);
    aula.setTipo(TipoAulaEnum.LABORATORIO.getDescripcion());

    boolean fueActualizado = aulaService.registrarAula(aula);

    Assert.assertTrue(fueActualizado);
  }

  @Test
  public void editarAulaNoExistente() {
    Aula aula = new Aula();
    aula.setIdAula(401); // Esta aula no existe
    short capacidad = 20;
    aula.setCapacidad(capacidad);
    aula.setTipo(TipoAulaEnum.LABORATORIO.getDescripcion());

    boolean fueActualizado = aulaService.registrarAula(aula);

    Assert.assertTrue(!fueActualizado);
  }

}
