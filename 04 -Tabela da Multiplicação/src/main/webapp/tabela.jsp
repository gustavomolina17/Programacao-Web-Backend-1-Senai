<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tabela de Multiplicação</title>
</head>
<body>
    <%-- Obtendo o valor do formulário --%>
    <% int valor = Integer.parseInt(request.getParameter("valor")); %>
    
    <h1>Tabela de Multiplicação para o Valor <%= valor %></h1>
    
    <table>
        <thead>
            <tr>
                <th>Número</th>
                <th>Resultado</th>
            </tr>
        </thead>
        <tbody>
            <%-- Gerando a tabela de multiplicação --%>
            <% for (int i = 1; i <= 10; i++) { %>
                <tr>
                    <td><%= i %></td>
                    <td><%= valor * i %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    
    <%-- Voltar para a página inicial --%>
    <br>
    <a href="index.jsp">Voltar</a>
</body>
</html>