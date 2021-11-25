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
    
    <title>Venta::</title>
</head>

<body>
	<div class="container-fluid">
		<form:form method="post" action="/venta/loginV" modelAttribute="venta">
			<form:label path="valorTotal">Valor Total:</form:label>
			<form:input type="number" path="valorTotal"/>
			<br>
			<form:label path="fecha">Fecha:</form:label>
			<form:input type="text" path="fecha"/>
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
		      <th scope="col">Valor Total</th>
		      <th scope="col">Fecha</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaVenta}" var="venta">
			    <tr>
			      <th scope="row"></th>
			      <td>${venta.getValorTotal()}</td>
			      <td>${venta.getFecha()}</td>
			      <td>
				      <form action="/venta/eliminarV" method="get">
				      	<input type="hidden" name="id" value="${venta.getId()}">
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