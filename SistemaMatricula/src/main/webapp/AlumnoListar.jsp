<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALUMNOS</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE INFORMACION </header>

		<nav>
		<table width="95%" align="center" cellspacing="0" cellpadding="0">
				<tr align="center">
					<th align="left">LISTA DE ALUMNOS</th>
					<th align="right">? :(</th>
				</tr>
			</table></nav>

		<section>
			<form method="post" name="frmAlumnoListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="400" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>CODIGO</th>
						<th>NOMBRE</th>
						<th>AP.PATERNO</th>
						<th>AP.MATERNO</th>
						<th>NACIMIENTO</th>
						<th>DNI</th>
						<th>TELEFONO</th>
						<th>SEXO</th>
						<th>EMAIL</th>
					</tr>

					<c:forEach var="varAlumno" items="${sessionScope.alumnoListar}">
						<tr bgcolor="#F5F6CE">
							<td width="60">${varAlumno.idAlumno}</td>
							<td>${varAlumno.nombre}</td>
							<td>${varAlumno.apellidoPaterno}</td>
							<td>${varAlumno.apellidoMaterno}</td>
							<td>${varAlumno.fechaNacimiento}</td>
							<td>${varAlumno.dni}</td>
							<td>${varAlumno.telefono}</td>
							<td>${varAlumno.sexo}</td>
							<td>${varAlumno.email}</td>
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