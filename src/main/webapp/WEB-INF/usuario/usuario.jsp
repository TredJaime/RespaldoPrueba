<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Usuario::</title>
</head>

<body>
	<div class="container-fluid">
		<form:form method="post" action="/usuario/login" modelAttribute="usuario">
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre"/>
			<br>
			<form:label path="apellido">Apellido:</form:label>
			<form:input type="text" path="apellido"/>
			<br>
			<form:label path="rut">Rut:</form:label>
			<form:input type="text" path="rut"/>
			<br>
			<form:label path="email">Email:</form:label>
			<form:input type="text" path="email"/>
			<br>
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">
		</form:form>
		<br>
		<hr>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Apellido</th>
		      <th scope="col">Rut</th>
		      <th scope="col">Email</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaUsuarios}" var="usuario">
			    <tr>
			      <th scope="row"></th>
			      <td>${usuario.getNombre()}</td>
			      <td>${usuario.getApellido()}</td>
			      <td>${usuario.getRut()}</td>
			      <td>${usuario.getEmail()}</td>
			       <td>editar</td>
			      <td>
				      <form action="/usuario/eliminar" method="get">
				      	<input type="hidden" name="id" value="${usuario.getId()}">
				      	<input type="submit" value="X">
				      </form>
			      </td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>	
	</div>
</body>

</html>