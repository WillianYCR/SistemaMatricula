<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>APODERADO</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE INFORMACION </header>

		<nav>
		<table width="95%" align="center" cellspacing="0" cellpadding="0">
				<tr align="center">
					<th align="left">LISTA DE APODERADO</th>
					<th align="right">? :(</th>
				</tr>
			</table></nav>

		<section>
			<form method="post" name="frmApoderadoListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="1000" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>CODIGO</th>
						<th>NOMBRE</th>
						<th>AP.PATERNO</th>
						<th>AP.MATERNO</th>
						<th>DNI</th>
						<th>SEXO</th>
						<th>TELEFONO</th>
						<th>ESTADO CIVIL</th>
						<th>DIRECCION</th>
						
					</tr>

					<c:forEach var="varApoderado" items="${sessionScope.apoderadoListar}">
						<tr bgcolor="#F5F6CE">
							<td width="60">${varApoderado.idApoderado}</td>
							<td>${varApoderado.nombre}</td>
							<td>${varApoderado.apellidoPaterno}</td>
							<td>${varApoderado.apellidoMaterno}</td>
							<td>${varApoderado.dni}</td>
							<td>${varApoderado.sexo}</td>
							<td>${varApoderado.telefono}</td>
							<td>${varApoderado.estadoCivil}</td>
							<td>${varApoderado.direccion}</td>
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