package dev.com.matricula.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/application-context.xml")
public class TestAutoscanSpring {

  @Autowired
  private LoginService loginService;

  @Test
  public void probarLogin() {
    String user = "pflores";
    
    UsuarioDTO usuario = loginService.obtenerDatoUsuarioAcceso(user);
    
    Assert.assertNotNull(usuario);
  }

}
