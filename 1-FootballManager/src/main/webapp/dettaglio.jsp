<%@page import="model.Calciatore"%>
<%@page import="database.DbCalciatori"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio</title>
</head>
<body>
	<%@ include file="menu.jsp"%>

	<%
		// request.getparameter legge da query string url (?nomeVar=valore)
		String idString = request.getParameter("id");
		if (idString != null) {

			int id = Integer.parseInt(idString);

			DbCalciatori db = new DbCalciatori();
			Calciatore calciatore = db.getCalciatoreById(id);
	%>
	
		
			<h6>Dettaglio:</h6>
			<img src="<%=calciatore.getUrl()%>" alt="<%=calciatore.getCognome()%>"
				width="200" height="200">
			<div>
				<p><%=calciatore.getCognome() + " " + calciatore.getNome()%>
				</p>
			</div>

	
	
	<%
		} else {
			out.print("no id");
		}
	%>

</body>
</html>