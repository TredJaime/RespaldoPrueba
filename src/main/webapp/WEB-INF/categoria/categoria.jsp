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
    
    <title>Producto::</title>
</head>

<body>
	
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Menu</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Producto <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/venta">Venta</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/usuario">Usuario</a>
      </li>
    </ul>
  </div>
</nav>


	<div class="container-fluid">
		<form:form method="post" action="/categoria/crearCa" modelAttribute="Categoria">
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre"/>
			<br>
			<form:label path="descripcion">Descripcion:</form:label>
			<form:input type="text" path="descripcion"/>
			<br>
			
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">
		</form:form>
		<br>
		
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Descripcion</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaCategoria}" var="categoria">
			    <tr>
			      <th scope="row">${categoria.getId()}</th>
			      <td>${categoria.getNombre()}</td>
			      <td>${categoria.getDescripcion()}</td>
			      <td>
			      <a href="/producto/${categoria.getId()}/editarP" class="btn btn-primary" role="button" data-bs-toggle="button">Editar</a>
			      </td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>	
		
		
	</div>
</body>

</html>