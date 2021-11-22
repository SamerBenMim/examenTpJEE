<%@ page import="metier.Produit" %>
<%@ page import="java.util.Vector" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listes des produits</title>
</head>
<body style="display:flex;flex-direction:column;justify-content:center;height:100vh;align-items:center">

<% Vector<Produit> produits=(Vector<Produit>) request.getAttribute("ProductVect");%>


<% if (produits==null) {response.sendRedirect("ArticleInexistant.jsp"); %>
    
<% } else { %>
    <% for(int i=0;i<produits.size();i++) { %>
        <ul>
            <li>Id Produit :<%=produits.get(i).getId() %></li>
            <li>Nom :<%=produits.get(i).getNom()%></li>
            <li>Desciption :<%=produits.get(i).getDescription()%></li>
            <li>Quantite :<%=produits.get(i).getQuantite()%> </li>
            <li>Prix :<%=produits.get(i).getPrix()%></li>
            <li><a href="#">Ajouter au panier</a></li>
        </ul>
    <% } %>
<% } %>


</body>
</html>
