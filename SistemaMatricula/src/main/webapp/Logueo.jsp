<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGUEO</title>
<link rel="stylesheet" href="css/EstiloLogueo.css">
</head>

<body>
	<div id="container" align="center">
		<header></header>

		<nav>
			<table width="765px" align="center" cellspacing="0" cellpadding="0">
				<tr align="center">
					<th align="left">ACCESO</th>
					<th align="right"><input type="submit" class="buttonMenu"
						style="width: 150px" name="btnProceso" value="Registrarse"
						onclick="window.location.href='UsuarioListar.jsp'" /></th>
				</tr>
			</table>
		</nav>

		<section>
			<form action="logueo.do" method="post"
				name="frmAulaActualizar" onsubmit="">
				<table class="tableforma" width="350px" bgcolor="#01A9DB"
					cellspacing="0" cellpadding="3">
					<tr>
						<td rowspan="4"><img alt="imagen"
							src="imagen/gif/LogoMundito.gif"></td>
							<td class="textlabel">***************</td>
					</tr>
					<tr>
						<td class="textlabel">USUARIO</td>
						<td class="textlabel">:</td>
						<td><input type="text" class="textbox" style="width: 150px"
							name="txtUsuario"></td>
					</tr>
					<tr>
						<td class="textlabel">CLAVE</td>
						<td class="textlabel">:</td>
						<td><input type="password" class="textbox"
							style="width: 150px" name="txtClave"></td>
					</tr>

					<tr align="center">
						<td colspan="3"><input type="submit" class="button"
							style="width: 120px" name="btnProceso" value="Ingresar" /> <input
							type="submit" class="button" style="width: 120px"
							name="btnProceso" value="Recuperar" /></td>
					</tr>
				</table>
			</form>
		</section>
		<footer>
			<div>developercenter@starting.com</div>
		</footer>
	</div>
</body>
</html>
