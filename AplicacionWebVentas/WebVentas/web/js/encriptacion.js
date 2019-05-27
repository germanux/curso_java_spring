function encriptar(valor) {
    var splitString = valor.split("");
    var reverseArray = splitString.reverse();
    var joinArray = reverseArray.join("");
    joinArray = "K7" + joinArray + "Up";    
    md5(joinArray);
    var hash = md5.create();
    hash.update(joinArray);
    return hash.hex();
}
function antesDeEnviar() {
    var passwd = document.getElementById("password").value;
    
    document.getElementById("password_encrip").value = encriptar(passwd);
    document.getElementById("password").value = "";
}
var form1 = document.getElementById("form1");
// Le pasamos la funcion anantesDeEnviar como función callback
form1.addEventListener("submit", antesDeEnviar );