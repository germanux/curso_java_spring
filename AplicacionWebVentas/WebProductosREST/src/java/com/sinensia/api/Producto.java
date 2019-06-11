/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.api;

import java.util.Random;

/**
 *
 * @author Admin - German
 */
public class Producto {   

    private static int contadorId = 1;
    private int id;
    private String nombre;
    private String precio;
    
    public Producto() {
        id = contadorId;
        Producto.contadorId++;
    }   

    public Producto(String nombre, String precio) {
        id = contadorId;
        Producto.contadorId++;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setPrecio(int id) {
        this.id = id;
    }

}
