<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado do Cálculo da Média ETB</title>
</head>
<body>
	<%-- Obtendo as notas do formulário --%>
	<% double nota1 = Double.parseDouble(request.getParameter("nota1"));
       double nota2 = Double.parseDouble(request.getParameter("nota2"));
       double nota3 = Double.parseDouble(request.getParameter("nota3"));
    %>

	<%-- Cálculo da média ponderada --%>
	<% double media = (nota1 + (2 * nota2) + (2 * nota3)) / 5; %>

	<h1>Resultado do Cálculo da Média Ponderada</h1>
	<p>
		A média Ponderada é:
		<%= media %></p>

	<%-- Voltar para a página inicial --%>
	<a href="Index.jsp">Voltar</a>
</body>
</html>
</html>