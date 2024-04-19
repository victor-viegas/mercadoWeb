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
        <link rel="stylesheet" href="./styles/shoppingCart.css">
        <title>HOME</title>
    </head>

    <body>
        <header>
            <div class="container-header d-flex">
                <div class="logo-container"></div>
                <div class="input-container">
                    <input type="text" class="form-control" id="inputSearch" name="search">
                    <button><i class="fa-solid fa-magnifying-glass"></i></button>
                </div>
                <div class="user-container">
                    <button><i class="fa-solid fa-user"></i></button>
                </div>
                <div class="cart-container">
                    <button id="cart-button-open"><i class="fa-solid fa-cart-shopping"></i></button>
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
            <div class="container-cart-shopping">
                <div id="shoppingCart">
                    <header class="header-cart">
                        <button class="btn btn-outline-success" id="cart-button-close"><i
                                class="fa-solid fa-xmark text-light"></i></button>
                        <div class="text-light">Carrinho(<span id="cart-itens-qtd">0</span>)</div>
                    </header>
                    <ul class="list-group-item">
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                        <li>
                            <section class="item-cart">
                                <div class="image-cart">
                                    <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                                        alt="">
                                </div>
                                <div class="container-name-cart-item">
                                    <span>Nome</span>
                                </div>
                                <div class="container-cart-trash">
                                    <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
                                </div>
                                <div class="container-value-cart">
                                    <span>R$99,99</span>
                                    <input type="number" value="1" min="0" max="1000" step="1" />
                                    <span>R$ 1290</span>
                                </div>
                            </section>
                        </li>
                    </ul>
                    <footer class="footer-cart">
                        <div class="table-values">
                            <table class="table table-borderless">
                                <tbody>
                                    <td class="text-td">Valor total</td>
                                    <td class="value-td">R$ <span id="total-price-footer">0</span></td>
                                </tbody>
                            </table>
                        </div>
                        <div class="button-confirm">
                            <a href="#" class="btn btn-success">FINALIZAR</a>
                        </div>
                    </footer>
                </div>
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
    <script src="./js/shoppingCart.js"></script>

    </html>