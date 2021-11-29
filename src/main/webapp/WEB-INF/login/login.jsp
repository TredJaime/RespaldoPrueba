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
    <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    
    <title>Login::</title>
    
</head>

<body>

	
	<h1>Bienvenido</h1>
	<h2>Ingresar a tu cuenta</h2>
	
	<div class="container-fluid">
		<form:form method="post" action="/login/login" modelAttribute="usuario">
			<form:label path="nombre">Usuario:</form:label>
			<form:input type="text" path="nombre" value="${usuario.getNombre()}" />
			<br>
			
			<input type="submit" value="Ingresar">
			<br>
			<a href="/usuario">Crear Usuario</a>
		</form:form>
		<br>
		
		
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
			      <th scope="row">${usuario.getId()}</th>
			      <td>${usuario.getNombre()}</td>
			      <td>${usuario.getApellido()}</td>
			      <td>${usuario.getRut()}</td>
			      <td>${usuario.getEmail()}</td>
			      <td>
			      <a href="/login/${usuario.getId()}/editar" class="btn btn-primary" role="button" data-bs-toggle="button">Editar</a>
			      
			      </td>
			      <td>
				      <form action="/login/eliminar" method="get">
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