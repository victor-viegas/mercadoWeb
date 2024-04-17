let products;
fetch('./list-products')
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao obter dados dos produtos');
        }
        return response.json();
    })
    .then(data => {
        products = data;
    })
    .catch(error => {
        console.error(error);
    });