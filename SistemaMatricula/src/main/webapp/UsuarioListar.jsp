<%@page import="dev.com.matricula.controller.AulaListarController"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USUARIO</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> SISTEMA DE INFORMACION </header>

		<nav>LISTA DE USUARIOS</nav>

		<section>
			<form method="post" name="frmUsuarioListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="750" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>CODIGO</th>
						<th>NOMBRE COMPLETO</th>
						<th>DNI</th>
						<th>LOGIN</th>
						<th>ESTADO</th>
					</tr>

					<c:forEach var="varUsuario" items="${sessionScope.usuarioListar}">
						<tr bgcolor="#F5F6CE">
							<td width="50" align="center">${varUsuario.idUsuario}</td>
							<td>${varUsuario.nombre}</td>
							<td width="60">${varUsuario.dni}</td>
							<td width="80">${varUsuario.login}</td>
							<td width="60">${varUsuario.estado}</td>
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