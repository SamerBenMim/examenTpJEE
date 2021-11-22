<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oops...</title>
</head>
<body style="display:flex;flex-direction:column;justify-content:center;height:100vh;align-items:center">
<h1>L'article recherché <%=request.getParameter("keyword") %> n'existe pas</h1>
</body>
</html>