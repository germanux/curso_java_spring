"use strict";
console.log("Generando tabla...");
// hola = 10; NO FUNCIONA
// generalTabla();
var miVairable = 10;

var lista = new Array();    // Es ignorado por la siguiente línea
// Así se hace un array de 2 dimensiones
lista = [["Vaina:", "Peine", "15 €", "7"]];
lista[1] = ["Vaina:", "Quitapelos", "30 €", "1"];
lista[2] = ["Vaina:", "Coche", "200 €", "2"];

generarTabla();
function generarTabla() {

    var table = document.getElementsByTagName("table");
    table = table[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    var nombrePrecio = "Precio vaina";
    table.innerHTML += `
<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
    </tr>
</thead>`;

    for (var i = 0; i < lista.length; i++) {
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]) {
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
        }
    }
}

function  agregarCosa() {
    var nombre = document.getElementById("nombre").value;
    var tipo = document.getElementById("tipo").value;
    var precio = document.getElementById("precio").value;
    var cantidad = document.getElementById("cantidad").value;

    // lista[2] = ["Vaina:", "Coche", "200 €", "2"];
    // var datosFila = [nombre, tipo, precio, cantidad];
    // lista[lista.length] = [nombre, tipo, precio, cantidad];
    lista.push([nombre, tipo, precio, cantidad]);
    generarTabla();
}

function  agregarCosaDirectamenteATabla() {
    var table = document.getElementsByTagName("table");
    table = table[0];
    var nombre = document.getElementById("nombre").value;
    var tipo = document.getElementById("tipo").value;
    var precio = document.getElementById("precio").value;
    var cantidad = document.getElementById("cantidad").value;
    var datosFila = [nombre, tipo, precio, cantidad];
    var nodoTR = document.createElement("tr");
    table.appendChild(nodoTR);
    for (var columna of datosFila) {
        var nodoCol = document.createElement("td");
        nodoTR.appendChild(nodoCol);
        var textoCol = document.createTextNode(columna);
        nodoCol.appendChild(textoCol);
    }
}

function  agregarCosaDirectamenteATablaInnerHTML() {
    var table = document.getElementsByTagName("table")[0];
    var nombre = document.getElementById("nombre").value;
    var tipo = document.getElementById("tipo").value;
    var precio = document.getElementById("precio").value;
    var cantidad = document.getElementById("cantidad").value;
    table.innerHTML += `<tr>
<td>${nombre}</td><td>${tipo}</td><td>${precio}</td><td>${cantidad}</td>
</tr>`;
}