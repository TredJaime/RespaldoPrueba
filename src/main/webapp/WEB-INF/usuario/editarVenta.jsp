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
    <title>Editar Usuario::</title>
</head>

<body>
	<div class="container">
		<form:form method="post" action="/venta/updateV/${venta.id}" modelAttribute="venta">
			<input type="hidden" name="_method" value="put">
			<form:label path="valorTotal" class="col-sm-2 col-form-label">Valor Total:</form:label>
			<form:input type="number" path="valorTotal" class="form-control"/>
			<br>
			<form:label path="fecha" class="col-sm-2 col-form-label">Fecha:</form:label>
			<form:input type="text" path="fecha" class="form-control"/>
			<br>
			<a href="/venta" class="btn btn-success" role="button" data-bs-toggle="button">Volver</a>
			<input class="btn btn-warning" type="submit" value="Editar">

		</form:form>
		
	
	</div>
</body>

</html>