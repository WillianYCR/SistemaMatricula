package dev.com.matricula.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.com.matricula.bean.SistemaSession.KeyAlumno;
import dev.com.matricula.dto.AlumnoDTO;
import dev.com.matricula.dto.UsuarioAlumnoDTO;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.serviceimpl.UsuarioServiceImpl;

@Component
public class ConsultaDatoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private AlumnoDTO alumno;
  @Autowired
  private ConsultaDatoAlumnoService consultaDatoAlumnoService;
  @Autowired
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

}
