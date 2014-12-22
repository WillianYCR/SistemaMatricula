package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Usuario;

public interface UsuarioDao {

	public boolean registrarUsuario(Usuario usuario);

	public Integer obtenerUltimoIdUsuario();

	public Usuario obtenerDatoUsuarioAcceso(String loginUsuario);

	public List<Usuario> obtenerUsuario();

	public List<Usuario> listarUsuario();

	public String obtenerLoginUsuario(int idUsuario);

}
