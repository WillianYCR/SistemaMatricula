<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VISOR DE AULA</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
   <div id="container" align="center">
      <header>
         <h1 style="color: white;">LISTADO DE AULAS DISPONIBLES</h1>
      </header>

      <nav>
         <h2 style="color: white;">Aulas</h2>
      </nav>
      <section>
         <form method="post" name="aulaListar" action="aulaListar.do" onsubmit="">
            <table cellpadding="10" bgcolor="#AAA000" align="center">
               <tr>
                  <th>AULA</th>
                  <th>DESCRIPCION DE AULA</th>
                  <th>CAPACIDAD</th>
               </tr>
               <!--imprimiendo los registros-->
               <c:forEach var="varAula" items="${sessionScope.aulaListar}">
                  <tr bgcolor="#F5F6CE">
                     <td>${varAula.idAula}</td>
                     <td>${varAula.tipo}</td>
                     <td>${varAula.capacidad}</td>
                  </tr>
               </c:forEach>
               <tr align="center">
                  <td colspan="3"><input type="submit"
                     value="Grabar" name="grabar" />
               </tr>
            </table>
            
         </form>
         <br> <br> <a href="AulaRegistrar.jsp">
            REGISTRAR NUEVA AULA</a>
      </section>
      <footer>
         <div>developercenter@starting.com</div>
      </footer>
   </div>
</body>
</html>