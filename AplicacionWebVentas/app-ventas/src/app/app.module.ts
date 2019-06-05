import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListaProductosComponent } from './lista-productos/lista-productos.component';
import { ProductosRestService } from './productos-rest.service';
import { HttpClientModule } from '@angular/common/http';
import { NuevoProductoComponent } from './nuevo-producto/nuevo-producto.component';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ListaProductosComponent,
    NuevoProductoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProductosRestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
