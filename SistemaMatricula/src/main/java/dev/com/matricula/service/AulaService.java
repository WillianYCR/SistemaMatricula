package dev.com.matricula.service;

import dev.com.matricula.model.Aula;
import java.util.List;

public interface AulaService {

	boolean registrarAula(Aula aula);

	boolean actualizarAula(Aula aula);
	
	boolean eliminarAula(Aula aula);

	public List<Aula> listarAula();

}
