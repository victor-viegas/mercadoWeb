const urlParams = new URLSearchParams(window.location.search);
const productId = urlParams.get('id');

function createProduct(product) {
    const card = document.createElement('article');
    card.classList.add('product');

    // Converter os bytes da imagem para uma string Base64
    const base64Image = arrayBufferToBase64(product.image);
    card.innerHTML = `
        <div class="image-container">
            <img src="data:image/png;base64,${base64Image}" alt="${product.name}">
        </div>
        <aside>
            <header>
                <h1>${product.name}</h1>
            </header>
            <section class="d-flex justify-content-between align-items-center">
                <div class="prices">
                    <span>R$ ${product.price}</span>
                </div>
                <a href="#" class="btn btn-success">ADICIONAR AO CARRINHO</a>
            </section>
        </aside>
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
//função que carregar o produto
function loadProduct(product) {
    const container = document.querySelector('.container');
    container.innerHTML = '';
    product.forEach(product => {
        const card = createProduct(product);
        container.appendChild(card);
    });
}

function getProductData(productId) {
    fetch('./product-item?id=' + productId)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao obter os dados do produto');
            }
            return response.json();
        })
        .then(data => {
            loadProduct(data);
            console.log(data)
        })
        .catch(error => {
            console.error('Erro:', error);
        });
}
getProductData(productId);