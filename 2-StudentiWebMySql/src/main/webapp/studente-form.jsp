<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuovo Studente</title>
</head>
<body>
	<div>Aggiungi nuovo studente</div>
	<form action="studenti" method="post">
		<input type="text" name="nome" placeholder="nome"><br>
		<input type="text" name="cognome" placeholder="cognome"><br>
		<input type="email" name="email" placeholder="email"><br>
		<input type="submit">
	</form>
</body>
</html>