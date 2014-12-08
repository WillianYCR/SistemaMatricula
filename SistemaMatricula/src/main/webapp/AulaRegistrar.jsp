<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MANTENIMIENTO DE AULAS</title>
<link rel="stylesheet" href="css/EstiloMantenimiento.css">
</head>
<body>
   <div id="container" align="center">
      <header>
         <h1 style="color: white;">SISTEMA DE PRINCIPAL</h1>
      </header>

      <nav>
         <h2 style="color: white;">Sistema de atención al Empleado</h2>
      </nav>

      <section>
         <form method="post" name="aulaRegistrar" action="aulaRegistrar.do">
            <table bgcolor="#01A9DB" border="1" cellspacing="0"
               cellpadding="5">
               <caption>REGISTRO DE EMPLEADOS</caption>
               <tr>
                  <td>AULA:</td>
                  <td><input type="text" name="txtIdAula"></td>
               </tr>
               <tr>
                  <td>DESCRIPCION:</td>
                  <td><input type="text" name="txtTipo"></td>
               </tr>
               <tr>
                  <td>CAPACIDAD:</td>
                  <td><input type="text" name="txtCapacidad"></td>
               </tr>

               <tr align="center">
                  <td colspan="3"><input type="submit"
                     value="Grabar" name="grabar" />
               </tr>
            </table>
         </form>
         <br> <br> <a href="AulaListar.jsp">
            MOSTRAR LAS AULAR</a>
      </section>
      <footer>
         <div>developercenter@starting.com</div>
      </footer>
</body>
</html>