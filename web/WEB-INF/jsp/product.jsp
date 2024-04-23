<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <script src="https://kit.fontawesome.com/52a6b206fa.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="image/x-icon" href="./assets/cesta.gif">
        <link rel="stylesheet" href="./styles/header.css">
        <link rel="stylesheet" href="./styles/shoppingCart.css">
        <link rel="stylesheet" href="./styles/productPage.css">
        <title>Produto</title>
    </head>

    <body>
        <header>
            <div class="container-header d-flex">
                <div class="logo-container">
                    <a href="./home">
                        <img src="./assets/cesta.gif" alt="logo">
                    </a>
                </div>
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
                    <div class="itens-cart-ul">
                        <ul class="list-group-item">
                        </ul>
                    </div>

                    <footer class="footer-cart">
                        <div class="table-values">
                            <table class="table table-borderless">
                                <tbody>
                                    <td class="text-td">Valor total</td>
                                    <td class="value-td">R$ <div id="total-price-footer"></div>
                                    </td>
                                </tbody>
                            </table>
                        </div>
                        <div class="button-confirm">
                            <a href="./finalize" class="btn btn-success">FINALIZAR</a>
                        </div>
                    </footer>
                </div>
            </div>
        </header>
        <main>
            <section class="container">
                <article>
                    <div class="image-container">
                        <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F19771846%2Fcoca-cola-sem-acucar-15-litros-1.jpg%3Fv%3D637610904787270000&w=384&q=75"
                            alt="">
                    </div>
                    <aside>
                        <header>
                            <h1>Refrigerante Coca-Cola Sem Açúcar 1,5L</h1>
                        </header>
                        <section class="d-flex justify-content-between align-items-center">
                            <div class="prices">
                                <span>R$ 6,79</span>
                            </div>
                            <a href="#" class="btn btn-success">ADICIONAR AO CARRINHO</a>
                        </section>
                    </aside>
                </article>
            </section>
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
    <script src="./js/shoppingCart.js"></script>

    </html>