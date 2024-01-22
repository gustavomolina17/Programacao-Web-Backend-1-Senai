<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cálculo do Salário Líquido</title>
</head>
<body>
    <h1>Cálculo do Salário Líquido</h1>
    
    <form action="calculo-salario.jsp" method="get">
        <label for="salario">Salário Bruto (R$):</label>
        <input type="number" id="salario" name="salario" step="0.01" required>
        <br>
        <br>
        <input type="submit" value="Calcular Salário Líquido">
    </form>
</body>
</html>