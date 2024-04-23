<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/128/14512/14512231.png">
    <title>Categoria</title>
</head>
<body>
    <h1>CATEGORIA</h1>
    <h1>PRODUTO</h1>
        <form action="CadastroController" enctype="multipart/form-data" method="post">
            IMAGEM
            <input type="file" name="image" class="form-control" placeholder="Carregue a imgaem" aria-label="Username"
                aria-describedby="basic-addon1">
            Nome
            <input type="text" name="name" class="form-control" placeholder="Nome do produto" aria-label="Username"
                aria-describedby="basic-addon1">
            VALOR
            <input type="text" name="price" class="form-control" placeholder="Valor do produtos" aria-label="Username"
                aria-describedby="basic-addon1">
            CATEGORIA
            <input type="text" name="category" class="form-control" placeholder="Valor do produtos"
                aria-label="Username" aria-describedby="basic-addon1">
            <input type="submit" value="ENVIAR">
        </form>
</body>
</html>