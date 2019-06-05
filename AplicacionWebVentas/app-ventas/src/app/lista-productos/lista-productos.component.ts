import { Component, OnInit } from '@angular/core';
import { Producto } from '../modelo/producto';
import { ProductosRestService } from 'src/app/productos-rest.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-lista-productos',
  templateUrl: './lista-productos.component.html',
  styleUrls: ['./lista-productos.component.css']
})
export class ListaProductosComponent implements OnInit {

  productos: Producto[];
  error: string = null;

  constructor(public serviceRest: ProductosRestService) { }

  ngOnInit() {
    this.productos = [];
    let observable: Observable<any>;
    observable = this.serviceRest.getRequest();
    observable.subscribe(
      (datos) => { this.recogerDatos(datos); },
      (error) => { this.procesarError(error); });
  }
  // Funcion callback cuando recibimmos datos
  recogerDatos(datosJson: any) {
    this.productos = datosJson;
    console.log(datosJson);
  }
  procesarError(error: any) {
    this.error = error;
    console.error("Eeeeh Error: >>> " + error);
  }
}
