<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/glider-js@1/glider.min.css">
        <script src="https://kit.fontawesome.com/52a6b206fa.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/128/14512/14512231.png">
        <link rel="stylesheet" href="./styles/cardProduct.css">
        <link rel="stylesheet" href="./styles/header.css">
        <title>HOME</title>
    </head>

    <body>
        <header>
            <div class="container-header d-grid">
                <div class="upper-header"></div>
                <div class="logo-container"></div>
                <div class="input-container">
                    <input type="text" class="form-control" id="inputSearch" name="search">
                    <button><i class="fa-solid fa-magnifying-glass"></i></button>
                </div>
                <div class="user-container">
                    <h2>USER</h2>
                </div>
                <div class="cart-container">
                    <button><i class="fa-solid fa-cart-shopping"></i></button>
                </div>
            </div>
            <div class="category-header">
                <nav>
                    <ul class="category d-flex">
                        <li><a href="#">Ver todas as categorias</a></li>
                        <li><a href="#">Ofertas</a></li>
                        <li><a href="#">Saudável</a></li>
                        <li><a href="#">Hortifrúti</a></li>
                        <li><a href="#">Limpeza</a></li>
                        <li><a href="#">Papelaria</a></li>
                        <li><a href="#">Bebidas</a></li>
                        <li><a href="#">Petshop</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <main>
            <a href="./register-user">CADASTRO</a>
            <a href="./login-user">LOGIN</a>
            <a href="./category-product">CATEGORIA</a>
            <a href="./product">PRODUTO</a>
            <div class="section-best-day">
                <h2>Destaque da Semana <i class="fa-solid fa-fire" style="color: #ff0000;"></i></h2>
                <div class="c-carousel c-carousel--simple">
                    <div class="c-carousel__slides js-carousel--simple d-flex">
                        <div class="card rounded border-0 m-2">
                            <a class="product-item" href="#">
                                <div class="card-body p-4">
                                    <img src="https://static.paodeacucar.com/img/uploads/1/120/24982120.png"
                                        alt="coca cola" class="img-fluid d-block mx-auto mb-3">
                                    <h5 class="name-product">Refrigerante Coca-Cola Original Garrafa 2L</h5>
                                    <span class="small text-muted font-italic"></span>
                                    <div class="price d-flex justify-content-center">
                                        <spam class="value">R$ 11,49</spam>
                                    </div>
                                    <div class="d-flex justify-content-center m-3">
                                        <a href="#" class="btn btn-success">Adicionar ao carrinho</a>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="carousel-buttons d-flex justify-content-center">
                        <button class="js-carousel--simple-prev btn btn-outline-dark m-2"
                            aria-label="Anterior">«</button>
                        <button class="js-carousel--simple-next btn btn-outline-dark m-2"
                            aria-label="Próximo">»</button>
                    </div>
                </div>
            </div>
        </main>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/glider-js@1/glider.min.js"></script>
    <script src="./js/cardCarousel.js"></script>
    <script src="./js/products.js"></script>

    </html>