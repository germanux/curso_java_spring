window.onload = function () {
    var btn_reg = document.getElementById("btn_registro_ajax");

    var alPulsarReg = function () {
        var nombre = document.getElementById("nombre").value;
        var email = document.getElementById("email").value;
        var edad = document.getElementById("edad").value;
        var activo = document.getElementById("activo").checked;
        activo = activo ? "on" : "off";
        var cliente = {
            "nombre": nombre,
            "email": email,
            "edad": edad,
            "activo": activo
        };
        var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
        
        var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX

        peticionHTTP.onreadystatechange = function () {
            // alert("Ha cambiado de estado");
            if (this.readyState === 4 && this.status === 200) {

                var jsonResp = this.responseText;
                var objResp = JSON.parse(jsonResp); // Deserializar JSON  en un objeto JS
                alert("¿Email recibido?  " + objResp["email"]
                        + " Y el nombre es  " + objResp.nombre);
            }
        };
        peticionHTTP.open("PUT", "api/registro", true);
        peticionHTTP.setRequestHeader("Content-type",
                "application/json");
        alert("Enviando...\n" + clienteJSON);
        peticionHTTP.send(clienteJSON);
    };
    btn_reg.addEventListener("click", alPulsarReg);
};