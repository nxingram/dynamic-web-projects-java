<%@page import="model.StudenteEs"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Studenti</title>
</head>
<body>
	<%
		// codice java

		ArrayList<StudenteEs> studenti = (ArrayList<StudenteEs>) request.getAttribute("chiave-studenti");
	%>
	<h2>elenco studenti</h2>

	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Email</th>
		</tr>

		<%
			// foreach
			for (StudenteEs s : studenti) {
				
				// ad ogni ciclo generro una riga della tabella 
				// con dentro i dati dello studente
		%>
		
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getNome()%></td>
			<td><%=s.getCognome()%></td>
			<td><%=s.getEmail()%></td>
		</tr>

		<%
			}
		%>

	</table>






</body>
</html>