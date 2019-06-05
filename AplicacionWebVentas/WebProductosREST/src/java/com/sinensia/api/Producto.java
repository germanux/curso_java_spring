/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.api;

/**
 *
 * @author Admin - German
 */
public class Producto {   

    private String nombre;
    private String precio;
    
    public Producto() {
    }   

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
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

}
