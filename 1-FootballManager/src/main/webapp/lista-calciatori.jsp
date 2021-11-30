<%@page import="model.Calciatore"%>
<%@page import="java.util.ArrayList"%>
<%@page import="database.DbCalciatori"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calciatori</title>
</head>
<body>
	<h1>Lista Calciatori</h1>
	
	<%@ include file="menu.jsp" %>
	
	
	<%
		// istanza di DbCalciatori
		DbCalciatori db = new DbCalciatori();
		// recupero lista calciatori dal db
		ArrayList<Calciatore> listCalciatori = db.getCalciatori();
	%>

	<ul>

		<%
			// ciclo la lista dei calciatori
			// foreach(Tipo nomevar : listaDaCiclare)
			// c = calciatore ennesimo
			for (Calciatore c : listCalciatori) {
		%>

		<li><%=c.getNome() + " " + c.getCognome()%></li>

		<%
			}
		%>

	</ul>
</body>
</html>