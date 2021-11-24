<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
   <!-- manda informacion de controller cliente a cliente.jsp -->
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>usuario</title>
</head>
<body>
	<div class="container">
	<form:form method="post" action="/usuario/login" modelAttribute="usuario">
		<form:label path="nombre">Nombre</form:label>
		<form:input type="text" path="nombre"/>
		<br>
		<form:label path="valor">Valor</form:label>
		<form:input type="integer" path="valor"/>
		<br>
		<form:label path="descripcion">Descripcion</form:label>
		<form:input type="text" path="descripcion"/>
		<br>
		<input type="button" value="Limpiar">
		<input type="submit" value="Submit">
		
	</form:form>
	
	
	<br>
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nombre</th>
      <th scope="col">Valor</th>
      <th scope="col">Descripcion</th>
    </tr>
  </thead>
  <!--  
  <tbody>
  <c:forEach items="${ListaUsuarios}" var="usuario">
    <tr>
      <th scope="row" ${usuario.getId()}></th>
      <td>${usuario.getNombre()}</td>
      <td>${usuario.getApellido()}</td>
      <td>${usuario.getRut()}</td>
      <td>${usuario.getCelular()}</td>
      <td>${usuario.getEdad()}</td>
      <td>
		<form action="/usuario/eliminar" method="get">
			<input type="hidden" name="id" value="${usuario.getId()}">
			<input type="submit" value="X">
		</form>
	  </td>
	  
	  <td>
		<form action="/usuario/actualizar" method="get">
			<input type="hidden" name="id" value="${usuario.getId()}">
			<input type="submit" value="X">
		</form>
	  </td>
    
    </tr>
    </c:forEach>
  </tbody>
  -->
</table>
	</div>
</body>
</html>