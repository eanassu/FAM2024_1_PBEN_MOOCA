<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primeira página JSP</title>
</head>
<body>
<p>Texto</p>
<p>
<%
String msg = "Mensagem";
out.println("Hello World JSP!");
%>
</p>
<p><%=msg %></p>

<%
System.out.println("JSP executada");
%>
</body>
</html>