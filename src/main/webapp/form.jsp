<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fam" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
rel="stylesheet"
href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Formul�rio</title>
</head>
<body>
<form action="Controller">
RA:<input type='text' name='ra'/><br/>
nome:<input type='text' name='nome'/><br/>
data de nascimento:<fam:campoData id='dataNascimento'/><br/>
renda:<input type='text' name='renda'/><br/>
<input type='hidden' name='op' value='Cadastrar'/>
<input type='submit' value='enviar'>
</form>
<a href='/Projeto'>voltar</a>
</body>
</html>