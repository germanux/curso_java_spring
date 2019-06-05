import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Producto } from './modelo/producto';


@Injectable({
  providedIn: 'root'
})
export class ProductosRestService {

  url = 'http://10.250.15.18:8084/WebProductosREST/api/productos';

  constructor(public clienteHttp: HttpClient) { }

  // Dame un objeto observable, que cuando tenga valor, avise... o cuando 
  // tenga un error
  getRequest(): Observable<any> {
    const objFuturo: Observable<any> = this.clienteHttp.get(this.url);
    return objFuturo;
  }
  addProducto(nombre: string, precio: string): Observable<any> {

    const nuevoProd: Producto = new Producto(nombre, precio);
    const json = JSON.stringify(nuevoProd);
    // const params = json;
   // const headers = new HttpHeaders().set('Content-Type', 'application/x-www-form-urlencoded');

    const objFuturo = this.clienteHttp.post(this.url, json 
      /*{'headers': headers }*/);
    return objFuturo;
  }
}
