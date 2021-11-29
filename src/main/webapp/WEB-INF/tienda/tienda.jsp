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
    
    <title>Tienda::</title>
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
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Valor</th>
		      <th scope="col">Descripcion</th>
		       <th scope="col">Categoria</th>
		      <th scope="col">Cantidad</th>
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
				        <form action="/usuario/eliminar" method="get">
				      	<input type="number" name="cantidad">
				      	<input type="submit" value="Agregar al carro">
				      </form>
				  </td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>	
		
		<h6>Buscar producto por categoria</h6>
		<div class="container-fluid">
		<form:form method="post" action="/producto/buscarCate" modelAttribute="producto">
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" value="${producto.getCategoria().getNombre()}" />
			
			<input type="submit" value="Buscar">
		</form:form>
		<br>
		
		
		
		
		
		
	</div>
		

</body>
</html>