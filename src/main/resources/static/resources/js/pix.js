function myFunctionCNPJ() {
    var copyText = document.getElementById("CNPJ");
    copy(copyText);
}

function myFunctionTelefone() {
    var copyText = document.getElementById("telefone");
    copy(copyText);
}

function copy(copyText){
    copyText.select();
    copyText.setSelectionRange(0, 99999); /* For mobile devices */
    document.execCommand("copy");
    /* Alert the copied text */
    confirm("Texto copiado " + copyText.value);
}