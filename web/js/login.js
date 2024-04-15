function validate() {
    let user = frmLogin.user.value;
    let password = frmLogin.password.value;

    if (user.trim() === "") {
        console.log("entrou")
        warningToast(text = 'Preencha o campo Nome de Usuario!');
        frmLogin.user.focus();
        return false;
    } else if (password.trim() === "") {
        warningToast(text = 'Preencha o campo senha!');
        frmLogin.password.focus();
        return false;
    } else if (users && users.some(item => item.user !== user) || users && users.some(item => item.password !== password)) {
        errorToast(text = 'Nome de Usuario ou senha incorretos!');
        frmLogin.user.focus();
        frmLogin.password.focus();
        return false;
    }
    document.forms["frmLogin"].submit();
}
let users;
fetch('./users')
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao obter dados dos usuários');
        }
        return response.json();
    })
    .then(data => {
        users = data;
    })
    .catch(error => {
        console.error(error);
    });