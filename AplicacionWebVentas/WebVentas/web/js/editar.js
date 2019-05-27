var alPulsarModificar = function () {
    antesDeEnviar();
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password_encrip").value;
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    var cliente = {
        "nombre": nombre,
        email: email,
        'edad': edad
    };
    cliente.password = password;
    cliente["activo"] = activo;
    
    var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
    alert("Enviando...\n" + clienteJSON);    
    
    // ActiveX para IE 7
    var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX
    // ¿Que tiene que hacer al recibir la respuesta?
    peticionHTTP.onreadystatechange = function () {
        alert("Ha cambiado de estado");
        if (this.readyState === 4 && this.status === 200) {
            alert("Hemos recibido algo!" + this.responseText);            
        } else {
            alert("Aun NO hemos recibido nada!");
        }
    };
    // Definimos la petición
    peticionHTTP.open("PUT", "http://localhost:8084/WebVentas/clientes2.do", true);
    // lanzamos la petición
    peticionHTTP.send(null);
};
document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar );