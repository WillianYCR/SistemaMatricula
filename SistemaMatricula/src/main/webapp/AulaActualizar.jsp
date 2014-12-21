
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
		<header> SISTEMA MANTENIMIENTO </header>

		<nav>ACTUALIZACION DE AULA</nav>

		<section>
			<%
				String idaula = "", tipo = "", capacidad = "";
				if (request.getParameter("idaula") != null) {
					idaula = request.getParameter("idaula");
					tipo = request.getParameter("tipo");
					capacidad = request.getParameter("capacidad");
				} else {
					out.print("<script>location.href='AulaListar.jsp'</script>");
				}
			%>
			<form action="aulaActualizarController.do" method="post"
				name="frmAulaActualizar" onsubmit="">
				<table class="tableforma" width="500" bgcolor="#01A9DB"
					cellspacing="0" cellpadding="5">

					<tr>
						<td class="textlabel">Codigo</td>
						<td class="textlabel">:</td>
						<td><input type="text" readonly="" class="textbox"
							style="width: 100px" name="txtIdAula" value="<%=idaula%>"></td>
					</tr>
					<tr>
						<td class="textlabel">Capacidad de personas</td>
						<td class="textlabel">:</td>
						<td><input type="text" class="textbox" style="width: 200px"
							name="txtTipo" value="<%=tipo%>"></td>
					</tr>
					<tr>
						<td class="textlabel">Capacidad</td>
						<td class="textlabel">:</td>
						<td><input type="text" class="textbox" style="width: 100px"
							name="txtCapacidad" value="<%=capacidad%>"></td>
					</tr>
					<tr align="center">
						<td colspan="3"><input type="submit" class="button"
							style="width: 150px" name="btnProceso" value="Actualizar" /> <input
							type="submit" class="button" style="width: 150px"
							name="btnProceso" value="Eliminar" /></td>
					</tr>
				</table>
			</form>

			<br> <a href="AulaListar.jsp" class="alink">Ver lista de
				aulas...</a>
		</section>
		<footer>
			<div>Willian Cahuaya Ramos -- learning@wiyocara.com</div>
		</footer>
	</div>
</body>
</html>
