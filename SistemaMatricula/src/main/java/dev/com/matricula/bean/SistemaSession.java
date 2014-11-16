package dev.com.matricula.bean;

import java.util.HashMap;
import java.util.Map;

import dev.com.matricula.dto.RolUsuarioDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.dto.UsuarioDTO;
import dev.com.matricula.util.enums.RolEnum;

public class SistemaSession {

  public static UsuarioDTO usuario = new UsuarioDTO();
  public static RolUsuarioDTO rolUsuario = new RolUsuarioDTO();

  private static Map<KeyAlumno, Object> dataAlumno = new HashMap<KeyAlumno, Object>();
  private static Map<KeyApoderado, Object> dataApoderado = new HashMap<KeyApoderado, Object>();
  private static Map<KeyDocente, Object> dataDocente = new HashMap<KeyDocente, Object>();

  // ************
  public enum KeyAlumno {
    DatosPersonales
  }

  public enum KeyApoderado {
    ListaAlumnos, AlumnoSeleccionado
  }

  public enum KeyDocente {
    ListaCursos
  }

  // *** Obtener datos generales
  public String getLogin() {
    return usuario.getLogin();
  }

  public UsuarioDTO getUsuario() {
    return usuario;
  }

  public static RolUsuarioDTO getRolUsuario() {
    return rolUsuario;
  }

  // ************
  public static void guardar(KeyAlumno key, Object objeto) {
    dataAlumno.put(key, objeto);
  }

  public static void guardar(KeyApoderado key, Object objeto) {
    dataApoderado.put(key, objeto);
  }

  public static void guardar(KeyDocente key, Object objeto) {
    dataDocente.put(key, objeto);
  }

  // ************
  public static Object getAlumno(KeyAlumno key) {
    return dataAlumno.get(key);
  }

  public static Object getApoderado(KeyApoderado key) {
    return dataAlumno.get(key);
  }

  public static Object getDocente(KeyDocente key) {
    return dataAlumno.get(key);
  }

  // ************

  public static int getAlumnoId() {
    return ((UsuarioAlumnoDTO) dataAlumno.get(KeyAlumno.DatosPersonales)).getAlumno().getId().intValue();
  }

  // ************
  public String getRol() {
    int id = rolUsuario.getRol().getId();
    for (RolEnum rol : RolEnum.values()) {
      if (rol.getCodigo() == id) {
        return rol.getDescripcion();
      }
    }
    return "No definido";
  }

}
