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
    
    <title>Producto::</title>
</head>

<body>
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
		      <th scope="col">Valor</th>
		      <th scope="col">Descripcion</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaProducto}" var="producto">
			    <tr>
			      <th scope="row"></th>
			      <td>${producto.getNombre()}</td>
			      <td>${producto.getValor()}</td>
			      <td>${producto.getDescripcion()}</td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>	
		
		
	</div>
</body>

</html>