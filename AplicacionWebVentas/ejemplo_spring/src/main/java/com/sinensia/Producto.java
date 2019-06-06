/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia;

/**
 *
 * @author Admin - German
 */
public class Producto {   

	private final long id;
    private String nombre;
    private String precio;
   

    public Producto(long id, String nombre, String precio) {
    	this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public long getId() {
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

}
