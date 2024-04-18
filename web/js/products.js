let products;

function createProductCard(product) {
    const card = document.createElement('div');
    card.classList.add('product-card');

    card.innerHTML = `
            <div class="card rounded border-0 m-2">
            <a class="product-item" href="#">
                <div class="card-body p-4">
                    <img src="${product.image}"
                        alt="${product.name}" class="img-fluid d-block mx-auto mb-3">
                    <h5 class="name-product">${product.name}</h5>
                    <div class="price d-flex justify-content-center">
                        <spam class="value">R$ ${product.price}</spam>
                    </div>
                    <div class="d-flex justify-content-center m-3">
                        <a href="#" class="btn btn-success">Adicionar ao carrinho</a>
                    </div>
                </div>
            </a>
            </div>
    `;

    return card;
}

function loadProductsIntoCarousel(products) {
    const carousel = document.querySelector('.js-carousel--simple');

    carousel.innerHTML = '';

    products.forEach(product => {
        const card = createProductCard(product);
        carousel.appendChild(card);
    });
}

fetch('./list-products')
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao obter dados dos produtos');
        }
        return response.json();
    })
    .then(data => {
        products = data;
        loadProductsIntoCarousel(products);
    })
    .catch(error => {
        console.error(error);
    });
