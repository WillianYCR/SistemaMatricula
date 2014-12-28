<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DOCENTE</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE INFORMACION </header>

		<nav>
			<table width="95%" align="center" cellspacing="0" cellpadding="0">
				<tr align="center">
					<th align="left">LISTA DE DOCENTES</th>
					<th align="right">? :(</th>
				</tr>
			</table>
		</nav>

		<section>
			<form method="post" name="frmDocenteListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="1000" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>CODIGO</th>
						<th>NOMBRE</th>
						<th>AP.PATERNO</th>
						<th>AP.MATERNO</th>
						<th>DNI</th>
						<th>SEXO</th>
						<th>ESPECIALIDAD</th>
						<th>EMAIL</th>
						<th>TELEFONO</th>
						<th>DIRECCION</th>
					</tr>

					<c:forEach var="varDocente" items="${sessionScope.docenteListar}">
						<tr bgcolor="#F5F6CE">
							<td width="60">${varDocente.idDocente}</td>
							<td width="120">${varDocente.nombre}</td>
							<td>${varDocente.apellidoPaterno}</td>
							<td>${varDocente.apellidoMaterno}</td>
							<td>${varDocente.dni}</td>
							<td>${varDocente.sexo}</td>
							<td>${varDocente.especialidad}</td>
							<td>${varDocente.email}</td>
							<td>${varDocente.telefono}</td>
							<td>${varDocente.direccion}</td>
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