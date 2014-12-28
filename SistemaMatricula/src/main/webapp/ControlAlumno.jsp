<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALUMNOS</title>
<link rel="stylesheet" href="css/EstiloControl.css">
</head>
<body>
	<div id="container" align="center">
		<header> INFORMACION DE ALUMNO </header>

		<nav>
			<table width="95%" align="center" cellspacing="0" cellpadding="0">
				<tr align="center">
					<th align="left">REGISTRAR NUEVA AULA</th>
					<th align="right"><input type="submit" class="buttonMenu"
						style="width: 150px" name="btnProceso" value="Listar aula"
						onclick="window.location.href='aulaListarController.do'" /></th>
				</tr>
			</table>
		</nav>

		<section>
			<table class="tableforma" width="99%" cellspacing="0" cellpadding="2">
				<tr>
					<td width="150px">
						<div class="divMenuIzquierdo">
							<form method="post" name="frmControlAlumnoMenu" action=""
								onsubmit="">
								<table class="tableforma" cellspacing="0" cellpadding="1">
									<tr>
										<th><input type="submit" class="buttonMenu"
											style="width: 150px" name="btnProceso" value="Datos"
											onclick="window.open('Prueba.jsp')" /></th>
									</tr>
									<tr>
										<th><input type="submit" class="buttonMenu"
											style="width: 150px" name="btnProceso" value="Matricula"
											onclick="window.open('Prueba.jsp')" /></th>
									</tr>
									<tr>
										<th><input type="submit" class="buttonMenu"
											style="width: 150px" name="btnProceso" value="Notas"
											onclick="window.open('Prueba.jsp')" /></th>
									</tr>
									<tr>
										<th><input type="submit" class="buttonMenu"
											style="width: 150px" name="btnProceso" value="Ejemplo"
											onclick="window.open('Prueba.jsp')" /></th>
									</tr>
								</table>
							</form>
						</div>
					</td>
					<td width="95%">
						<div class="divMenuDerecho">
							<form method="post" name="frmControlAlumnoCuerpo" action="">
								<%@ include file="VisorAlumnoGradoListar.jsp"%>
							</form>
						</div>
					</td>
				</tr>
			</table>

		</section>
		<footer>
			<div>developercenter@starting.com</div>
		</footer>
</body>
</html>