import { Component, OnInit } from '@angular/core';
import { ProductosRestService } from 'src/app/productos-rest.service';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-nuevo-producto',
  templateUrl: './nuevo-producto.component.html',
  styleUrls: ['./nuevo-producto.component.css']
})
export class NuevoProductoComponent implements OnInit {

  nombre: string;
  precio: string;
  constructor(public servicioProd: ProductosRestService) {
    this.nombre = "pruebaaa";
  }

  ngOnInit() {
  }
  enviarProducto() {
    let objFuturo: Observable<any>;
    objFuturo = this.servicioProd.addProducto(this.nombre, this.precio);
    objFuturo.subscribe((datos) => { console.log(datos); },
      (error) => { console.log(error); });
  }
}
