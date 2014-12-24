<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AULA</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
	<div id="container" align="center">
		<header> LISTADO DE AULAS DISPONIBLES </header>

		<nav>
			<table width="95%" align="center" cellspacing="0"
				cellpadding="0">
				<tr align="center">
					<th align="left">LISTA DE AULAS</th>
					<th align="right"><input type="submit" class="buttonMenu"
						style="width: 150px" name="btnProceso" value="Registrar aula"
						onclick="window.location.href='AulaRegistrar.jsp'" /></th>
				</tr>
			</table>
		</nav>

		<section>
			<form method="post" name="frmAulaListar" action="" onsubmit="">
				<table class="tableforma" border="1" width="600" bgcolor="#00BFFF"
					align="center" cellspacing="0" cellpadding="5">
					<tr align="center">
						<th>AULA</th>
						<th>DESCRIPCION DE AULA</th>
						<th>CAPACIDAD</th>
					</tr>

					<!--imprimiendo los registros-->
					<c:forEach var="varAula" items="${sessionScope.aulaListar}">
						<tr bgcolor="#F5F6CE">
							<td width="60"><a
								href='AulaActualizar.jsp?idaula=${varAula.idAula}
							&tipo=${varAula.tipo}&capacidad=${varAula.capacidad}
							' />
								${varAula.idAula}</td>
							<td>${varAula.tipo}</td>
							<td width="60">${varAula.capacidad}</td>
						</tr>
					</c:forEach>

				</table>
			</form>
			<br> <a href="AulaListar.jsp" class="alink"> Regresar inicio</a>
		</section>
		<footer>
			<div>developercenter@starting.com</div>
		</footer>
	</div>
</body>
</html>