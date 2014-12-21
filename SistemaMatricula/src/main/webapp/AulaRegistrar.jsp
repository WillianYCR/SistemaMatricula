<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AULAS</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE MANTENIMIENTO </header>

		<nav>REGISTRAR NUEVA AULA</nav>

		<section>
			<form method="post" name="frmAulaRegistrar"
				action="aulaRegistrarController.do" onsubmit="">
				<table bgcolor="#01A9DB" class="tableforma" width="360"
					cellspacing="0" cellpadding="5">
					<tr>
						<td class="textlabel">Descripción</td>
						<td class="textlabel">:</td>
						<td><input type="text" class="textbox" style="width: 200px"
							name="txtTipo"></td>
					</tr>
					<tr>
						<td class="textlabel">Capacidad de personas</td>
						<td class="textlabel">:</td>
						<td><input type="text" class="textbox" style="width: 100px"
							name="txtCapacidad"></td>
					</tr>

					<tr align="center">
						<td colspan="3"><input type="submit" class="button"
							style="width: 150px" name="btnProceso" value="Grabar" />
					</tr>
				</table>
			</form>
			<br> <a href="aulaListarController.do" class="alink"> Ver
				listar de aulas...</a>
		</section>
		<footer>
			<div>developercenter@starting.com</div>
		</footer>
</body>
</html>