<%@page import="dev.com.matricula.controller.AulaListarController"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SECCION</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE INFORMACION </header>

		<nav>LISTA DE SECCIONES</nav>

		<section>
			<form method="post" name="frmSeccionListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="400" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>CODIGO</th>
						<th>DESCRIPCION</th>
					</tr>

					<c:forEach var="varSeccion" items="${sessionScope.seccionListar}">
						<tr bgcolor="#F5F6CE">
							<td width="60">${varSeccion.idSeccion}</td>
							<td>${varSeccion.descripcion}</td>
						</tr>
					</c:forEach>

				</table>
			</form>
		</section>
		<footer>
			<div>developercenter@starting.com</div>
		</footer>
	</div>
</body>
</html>