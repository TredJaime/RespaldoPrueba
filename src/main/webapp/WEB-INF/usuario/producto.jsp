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
        <a class="nav-link" href="/producto">Producto <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/categoria">Categoria <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/tienda">Tienda</a>
      </li>
    </ul>
  </div>
</nav>
		


	<div class="container-fluid">
		<form:form method="post" action="/producto/loginP" modelAttribute="producto">
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre"/>
			<br>
			<form:label path="valor">Valor:</form:label>
			<form:input type="number" path="valor"/>
			<br>
			<form:label path="descripcion">Descripcion:</form:label>
			<form:input type="text" path="descripcion"/>
			<br>
			<form:label path="categoria">Categoria:</form:label>
			<form:select class="form-select" path="categoria">
				<c:forEach var="categoria" items="${listaCategoria}">
					<form:option value="${categoria.getId()}">${categoria.getNombre()}</form:option>
				</c:forEach>
			</form:select>
			<br>
			<input type="submit" value="Submit">
		</form:form>
		<br>
		
		
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Valor</th>
		      <th scope="col">Descripcion</th>
		       <th scope="col">Categoria</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaProducto}" var="producto">
			    <tr>
			      <th scope="row">${producto.getId()}</th>
			      <td>${producto.getNombre()}</td>
			      <td>${producto.getValor()}</td>
			      <td>${producto.getDescripcion()}</td>
			      <td>${producto.getCategoria().getNombre()}</td>
			      <td>
			      <a href="/producto/${producto.getId()}/editarP" class="btn btn-primary" role="button" data-bs-toggle="button">Editar</a>
			
			      </td>
			      <td>
				      <form action="/producto/eliminarP" method="get">
				      	<input type="hidden" name="id" value="${producto.getId()}">
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