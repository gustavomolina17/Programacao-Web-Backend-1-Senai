<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cálculo da Média</title>
</head>
<body>
    <h1>Cálculo da Média</h1>
    
    <form action="calculo-media.jsp" method="get">
        <label for="nota1">Nota 1:</label>
        <input type="number" id="nota1" name="nota1" step="0.01" required>
        <br>
        <label for="nota2">Nota 2:</label>
        <input type="number" id="nota2" name="nota2" step="0.01" required>
        <br>
        <label for="nota3">Nota 3:</label>
        <input type="number" id="nota3" name="nota3" step="0.01" required>
        <br>
        <br>
        <input type="submit" value="Calcular Média">
    </form>
</body>
</html>