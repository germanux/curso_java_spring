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
        // alert("Ha cambiado de estado");
        if (this.readyState === 4 && this.status === 200) {
            // alert("Hemos recibido algo!" + this.responseText);     
            var jsonResp = this.responseText;
            var objResp = JSON.parse(jsonResp); // Deserializar JSON  en un objeto JS
            alert ("¿Email recibido?  "  + objResp["email"]
                    + " Y el nombre es  " + objResp.nombre);
            console.log("JSON: >> " + jsonResp);
            var divInfo = document.getElementById("div_info");
            divInfo.style = "display: block";
            /*var spanNombre = document.getElementById("span_nombre");
            var spanEmail = document.getElementById("span_email");
            var spanPassword = document.getElementById("span_password");*/
            var spanId = document.getElementById("span_id");
            var spanEdad = document.getElementById("span_edad");
            var spanActivo = document.getElementById("span_activo");
            document.getElementById("span_nombre").innerHTML = objResp.nombre;
            document.getElementById("span_email").innerHTML = objResp.email;
            document.getElementById("span_password").innerHTML = objResp.password;
            spanId.innerHTML = objResp.id;
            spanEdad.innerHTML = objResp.edad;
            spanActivo.innerHTML = objResp.activo;
        } /*else {
            alert("Aun NO hemos recibido nada!");
        }*/
    };
    // Definimos la petición
    // document.location = "www.otraweb.com";
    peticionHTTP.open("PUT", /*http://localhost:8084/WebVentas/*/  "clientes2.do", true);
    peticionHTTP.setRequestHeader("Content-type" , 
            "application/x-www-form-urlencoded");
    // lanzamos la petición
    var form1 = document.getElementById("form1");
    var formData = new FormData(form1);
    var cadenaEnvio = 
          "nombre=" + encodeURIComponent(document.getElementById("nombre").value)
          + "&email=" + encodeURIComponent(document.getElementById("email").value)
          + "&password_encrip=" + encodeURIComponent(document.getElementById("password_encrip").value)
          + "&activo=" + encodeURIComponent(activo)
          + "&edad=" + encodeURIComponent(document.getElementById("edad").value);
    
    alert("¿Qué se va a enviar?\n" + cadenaEnvio);
    peticionHTTP.send(cadenaEnvio);
};
// document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar );
document.getElementById("btn_modificar").onclick = alPulsarModificar;
