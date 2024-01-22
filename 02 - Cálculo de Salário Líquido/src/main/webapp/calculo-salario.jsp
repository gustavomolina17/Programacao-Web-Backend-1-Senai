<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado do Cálculo do Salário Líquido</title>
</head>
<body>
    <%-- Obtendo o salário bruto do formulário --%>
    <% double salarioBruto = Double.parseDouble(request.getParameter("salario")); %>
    
    <%-- Cálculo do desconto do INSS --%>
    <% double descontoINSS;
       if (salarioBruto <= 1659.38) {
           descontoINSS = salarioBruto * 0.08;
       } else if (salarioBruto <= 2765.66) {
           descontoINSS = salarioBruto * 0.09;
       } else if (salarioBruto <= 5531.31) {
           descontoINSS = salarioBruto * 0.11;
       } else {
           descontoINSS = 608.45;
       }
    %>
    
    <%-- Cálculo do salário líquido --%>
    <% double salarioLiquido = salarioBruto - descontoINSS; %>
    
    <h1>Resultado do Cálculo do Salário Líquido</h1>
    <p>Salário Bruto: R$ <%= salarioBruto %></p>
    <p>Desconto do INSS: R$ <%= descontoINSS %></p>
    <p>Salário Líquido: R$ <%= salarioLiquido %></p>
    
    <%-- Voltar para a página inicial --%>
    <a href="Index.jsp">Voltar</a>
</body>
</html>