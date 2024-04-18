let products;
//função que cria os cards dos produtos
function createProductCard(product) {
    const card = document.createElement('div');
    card.classList.add('product-card');

    // Converter os bytes da imagem para uma string Base64
    const base64Image = arrayBufferToBase64(product.image);

    card.innerHTML = `
        <div class="card rounded border-0 m-2">
            <a class="product-item" id="${product.idProduct}" href="#">
                <div class="card-body p-4">
                    <img src="data:image/png;base64,${base64Image}" alt="${product.name}" class="img-fluid d-block mx-auto mb-3">
                    <h5 class="name-product">${product.name}</h5>
                    <div class="price d-flex justify-content-center">
                        <span class="value">R$ ${product.price}</span>
                    </div>
                    <div class="btn-container d-flex justify-content-center m-3">
                        <a href="#" class="btn btn-success">Adicionar ao carrinho</a>
                    </div>
                </div>
            </a>
        </div>
    `;

    return card;
}

// Função para converter um array de bytes em uma string Base64
function arrayBufferToBase64(buffer) {
    let binary = '';
    const bytes = new Uint8Array(buffer);
    const len = bytes.byteLength;
    for (let i = 0; i < len; i++) {
        binary += String.fromCharCode(bytes[i]);
    }
    return window.btoa(binary);
}

//função que carregar os cards no carrosel
function loadProductsIntoCarousel(products) {
    const carousel = document.querySelector('.js-carousel--simple');

    carousel.innerHTML = '';

    products.forEach(product => {
        const card = createProductCard(product);
        carousel.appendChild(card);
    });
}
//Acesso aos dados da api
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
