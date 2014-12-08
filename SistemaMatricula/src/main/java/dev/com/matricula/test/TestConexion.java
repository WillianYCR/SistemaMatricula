package dev.com.matricula.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import dev.com.matricula.daoimpl.AulaDaoImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dev.com.matricula.service.AulaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/application-context.xml")
public class TestConexion {
	@Autowired
	private AulaService aulaService;
	
	@Test
	public void probarListar() {
		ArrayList lista = new ArrayList();
		lista = (ArrayList) aulaService.listarAula();
		System.out.println("cantidad de aulas : " + lista.size());
		System.out.println("aulas : " + lista.size());
		System.out.println("cantidad de aulas : " + lista.size());
		Assert.assertNotNull(lista);
	}
}

class Prueba{
	
    public Connection Conectar(){
    	Connection cnn = null;
        String url = "jdbc:mysql://localhost:3306/bdmatricula";
        String user="root";
        String pass= "rooot";
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cnn = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion satisfactoria");
        } catch (Exception e) {
            System.err.println("Conexion Error -->" + e.getMessage());
        }
        return cnn;
    }
}
