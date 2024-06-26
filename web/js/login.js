function validate() {
    let user = frmLogin.user.value;
    let password = frmLogin.password.value;

    if (user.trim() === "") {
        warningToast(text = 'Preencha o campo Nome de Usuário!');
        frmLogin.user.focus();
        return false;
    } else if (password.trim() === "") {
        warningToast(text = 'Preencha o campo senha!');
        frmLogin.password.focus();
        return false;
    } else {
        let matchedUser = users.find(item => item.user === user && item.password === password);
        if (!matchedUser) {
            errorToast(text = 'Nome de Usuário ou senha incorretos!');
            frmLogin.user.focus();
            frmLogin.password.focus();
            return false;
        } else {
            sendUserId(matchedUser.idUser);
            document.forms["frmLogin"].submit();
        }
    }
}
function sendUserId(userId) {
    fetch(`./login?userId=${userId}`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao enviar solicitação');
            }
        })
        .catch(error => {
            console.error(error);
        });
}

let users;
fetch('./users')
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao obter dados');
        }
        return response.json();
    })
    .then(data => {
        users = data;
        console.log(users)
    })
    .catch(error => {
        console.error(error);
    });