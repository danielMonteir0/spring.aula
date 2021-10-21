function openModal() {
    let btn = document.getElementById("modal");
    if(btn) {   
        let modal = document.getElementById("myModal");     
        modal.style.display = "block";
    }
}

function closeModal() {
    let span = document.getElementsByClassName("close")[0];
    if(span) {
        let modal = document.getElementById("myModal");
        modal.style.display = "none";
    }
}

function validacao() {
    let firstName = document.getElementById('first_name').value
    let lastName = document.getElementById('last_name').value 
    let password = document.getElementById('password').value 
    let email = document.getElementById('email').value

    if(firstName.length == 0 || lastName.length == 0 || password.length == 0 || email.length == 0) {
        alert('Nenhum dos dados podem ficar em branco.')
        return
    }
    alert('Dados enviados com sucesso!')

}