const cartButtonOpen = document.getElementById('cart-button-open');
const cartButtonClose = document.getElementById('cart-button-close');
let priceFooter = document.getElementById('total-price-footer');

function toggleMenu(event) {
    const menu = document.getElementById('shoppingCart');
    menu.classList.toggle('active');
}

cartButtonOpen.addEventListener('click', toggleMenu);
cartButtonClose.addEventListener('click', toggleMenu);

function createCartCard(cartItens) {
    const cardItem = document.createElement('li');
    let totalPrice = cartItens.priceUnitary * cartItens.quantity;
    cardItem.innerHTML = `
        <section class="item-cart" id="${cartItens.idProduct}">
            <div class="image-cart">
                <img src="https://mercado.carrefour.com.br/_next/image?url=https%3A%2F%2Fcarrefourbrfood.vtexassets.com%2Farquivos%2Fids%2F97508577%2Fgin-tanqueray-london-dry-750ml-1.jpg%3Fv%3D638100837585500000&w=96&q=50"
                    alt="">
            </div>
            <div class="container-name-cart-item">
                <span>${cartItens.name}</span>
            </div>
            <div class="container-cart-trash">
                <i class="fa-solid fa-trash-can fa-xs btn btn-outline-danger"></i>
            </div>
            <div class="container-value-cart">
                <span>R$${cartItens.priceUnitary}</span>
                <input type="number" value="${cartItens.quantity}" min="0" max="1000" step="1" />
                <span>R$ ${totalPrice.toFixed(2)}</span>
            </div>
        </section>
    `;
    return cardItem;
}

function loadCartProduct(cartItens) {
    const element = document.querySelector('.list-group-item');

    element.innerHTML = '';

    cartItens.forEach(cartItens => {
        const card = createCartCard(cartItens);
        element.appendChild(card);
    });
}

fetch('./cart-itens')
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao obter dados dos produtos');
        }
        return response.json();
    })
    .then(data => {
        loadCartProduct(data);
    })
    .catch(error => {
        console.error(error);
    });