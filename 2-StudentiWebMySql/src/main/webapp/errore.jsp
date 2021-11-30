<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Errore</title>
</head>
<body>
	<%
		// codice java

		String errore = (String) request.getAttribute("chiave-errore");
	%>
	<h2><%=errore %></h2>
</body>
</html>