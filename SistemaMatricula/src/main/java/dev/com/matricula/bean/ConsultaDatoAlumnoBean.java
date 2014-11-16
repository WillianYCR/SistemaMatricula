package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.bean.SistemaSession.KeyAlumno;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.serviceimpl.UsuarioServiceImpl;

public class ConsultaDatoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private AlumnoDTO alumno;
  private ConsultaDatoAlumnoService consultaDatoAlumnoService;
  private UsuarioServiceImpl usuarioService;

  public ConsultaDatoAlumnoBean() {
    alumno = new AlumnoDTO();
  }

  public String obtenerDatosAlumno() {
    Object data = SistemaSession.getAlumno(KeyAlumno.DatosPersonales);
    UsuarioAlumnoDTO dto = (UsuarioAlumnoDTO) data;
    alumno = dto.getAlumno();
    return "/pages/consultaDatoAlumno.xhtml";
  }

  public AlumnoDTO getAlumno() {
    return alumno;
  }

  public void setAlumno(AlumnoDTO alumno) {
    this.alumno = alumno;
  }

  public void setConsultaDatoAlumnoService(ConsultaDatoAlumnoService consultaDatoAlumnoService) {
    this.consultaDatoAlumnoService = consultaDatoAlumnoService;
  }

  public void setUsuarioService(UsuarioServiceImpl usuarioService) {
    this.usuarioService = usuarioService;
  }

}
