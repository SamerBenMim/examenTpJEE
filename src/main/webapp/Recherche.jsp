<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rechereche Produits</title>
</head>
<body style="display:flex;flex-direction:column;justify-content:center;height:100vh;align-items:center">
<form method="GET" action="ServletListe">
<label>
Mot cl� :
<input type="text" placeholder="Mot cl�" name="keyword"  >
<input type="submit">
</label>
</form>
</body>
</html>