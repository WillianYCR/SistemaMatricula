package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;

import dev.com.matricula.bean.SistemaSession.KeyAlumno;
import dev.com.matricula.bean.SistemaSession.KeyApoderado;
import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.LoginService;
import dev.com.matricula.util.enums.RolEnum;

public class LoginBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private String login;
  private String clave;

  private UsuarioDTO usuario;
  private RolUsuarioDTO rolUsuario;
  private LoginService loginService;
  private List<UsuarioAlumno> usuarioAlumnosList;

  public LoginBean() {
	  System.out.println("Si llega aca");
  }

  public String validarLogueo() {

	  System.out.println("Si llega");
	  
    usuario = loginService.obtenerDatoUsuarioAcceso(login);

    if (usuario == null) {
      // TODO: Mensaje USUARIO NO EXISTE
      return "LOGIN";
    }
//    SistemaSession.setUsuario(usuario);
    SistemaSession.usuario = usuario;

    // TODO: Realizar el Proceso para hacer el incriptado de clave
    if (!usuario.getClave().equals(clave)) {
      // TODO: Mensaje CLAVE INCORRECTA
      return "LOGIN";
    }

    rolUsuario = loginService.obtenerDatoUsuarioRol(usuario.getId());

    if (rolUsuario == null) {
      // TODO: Mensaje NO CUENTA CON UN ROL DE ACCESO
      return "LOGIN";
    }
    SistemaSession.rolUsuario = rolUsuario;

    final Integer codigoRol = SistemaSession.getRolUsuario().getRol().getId();

    if (RolEnum.ALUMNO.getCodigo().intValue() == codigoRol.intValue()) {
      List<UsuarioAlumnoDTO> listaPermisos = loginService.obtenerPermisosAlumnos(SistemaSession.usuario.getId());
      if(listaPermisos == null || listaPermisos.isEmpty()){
        return "LOGIN";
      }
      SistemaSession.guardar(KeyAlumno.DatosPersonales, listaPermisos.get(0));
      /* Comentario: Aca se obtiene los permisos para el usuario, pero en este
       * caso ingresara directamenta ya que es el mismo alumno Pero como se q me
       * vas a hacer una pregunta de: por que mejor no se hace una consulta
       * defrente para obtener al alumno. Te respondo: claro, esta bien, pero
       * dejemos por el momento ahi, para ver si mas adelante ese alumno puede
       * ver la nota de sus hermano o algo por el estilo. OJO, le estoy
       * asignando el valor de la fila en "0" de la lista realizadas
       * 
       * Por lo Tanto: esto ya esta como TERMINADO :D Lo que te toca hacer: es
       * agragarle los DTO que consideres (Y) a partir de aca. Si se me pas�
       * algo, puedes realizarlo. luego me explica, si entiendo lo que vas a
       * intentar decir jaja */
//      SistemaSession.ID_ALUMNO = usuarioAlumnosList.get(0).getAlumno().getIdAlumno();
      return "CONSULTAS";
    } else if (RolEnum.APODERADO.getCodigo().equals(codigoRol)) {
      List<UsuarioAlumnoDTO> listaPermisos = loginService.obtenerPermisosAlumnos(SistemaSession.usuario.getId());
      if(listaPermisos == null || listaPermisos.isEmpty()){
        return "LOGIN";
      }
      SistemaSession.guardar(KeyApoderado.ListaAlumnos, listaPermisos);
      SistemaSession.guardar(KeyApoderado.AlumnoSeleccionado, 0);
      // TODO: Reenviar mensaje al usuario de los alumnos disponibles
      // TODO: Retornar el valo de "seleccionAlumno = x "
      /* Aca es donde se va a enviar mensaje por java script y el usuario
       * DOCENTE pueda ver a que alumnos tiene permiso ver. Por lo cual el
       * DOCENTE seleccionar� solo a uno y nos retornara un numero a la variable
       * "seleccionAlumno" para luego cargar. El an�lisis esta en que decidar
       * ver en ese momento a otro, ps ya no tendria que loguearse de nuevo si o
       * no? Y si me dices como lo realizar�a por JavaScript, ps jaja, tambi�n
       * tendria que verlo recien, pero creo que esta facil. Eso es tema de
       * investigar un poquito y YA!!!!
       * Realizar tambi�n: cargar los DTO como en el anterior paso (Y) y
       * bla,bla,bla,bla*/
    } else if (RolEnum.DOCENTE.getCodigo() == codigoRol) {
      return "DOCENTE";
    } else if (RolEnum.MATRICULANTE.getCodigo() == codigoRol) {
      return "MATRICULA";
    } else if (RolEnum.ADMINISTRADOR.getCodigo() == codigoRol) {
      return "ADMINISTRADOR";
    }

    return "LOGIN";

  }

  public void setLoginService(LoginService loginService) {
    this.loginService = loginService;
  }

  public UsuarioDTO getUsuario() {
    return usuario;
  }

  public void setUsuario(UsuarioDTO usuario) {
    this.usuario = usuario;
  }

  public RolUsuarioDTO getRolUsuario() {
    return rolUsuario;
  }

  public void setRolUsuario(RolUsuarioDTO rolUsuario) {
    this.rolUsuario = rolUsuario;
  }

  public List<UsuarioAlumno> getUsuarioAlumnosList() {
    return usuarioAlumnosList;
  }

  public void setUsuarioAlumnosList(List<UsuarioAlumno> usuarioAlumnosList) {
    this.usuarioAlumnosList = usuarioAlumnosList;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

}
