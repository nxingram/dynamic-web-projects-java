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
<style type="text/css">
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
	<h1>Tabella Calciatori</h1>

	<%@ include file="menu.jsp"%>

	<!-- creare una tabella che stampa tutte le caratteristiche dei calciatori  -->

	<!-- tabella header -->
	<!--  cognome | nome | eta | numero | posizione -->
	<!-- tabella body -->
	<!--  maldini | daniel | 19 | ...   | ... -->

	<%
		// istanza di DbCalciatori
		DbCalciatori db = new DbCalciatori();
		// recupero lista calciatori dal db
		ArrayList<Calciatore> listCalciatori = db.getCalciatori();
	%>
	<table>
		<tr>
			<th>Cognome</th>
			<th>Nome</th>
			<th>Eta</th>
			<th>Numero</th>
			<th>Posizione</th>
		</tr>

		<%
			// ciclo la lista dei calciatori
			// foreach(Tipo nomevar : listaDaCiclare)
			// c = calciatore ennesimo
			int i=0;
			for (Calciatore c : listCalciatori) {
		%>
		
		<tr>
			<td> 
				<a href="dettaglio.jsp?id=<%=i %>">
					<%=c.getCognome()%>
				</a>
			</td>
			<td><%=c.getNome()%></td>
			<td><%=c.getEta()%></td>
			<td><%=c.getNumero()%></td>
			<td><%=c.getPosizione()%></td>
		</tr>

		<%
			i++;
			}
		%>

	</table>
</body>
</html>