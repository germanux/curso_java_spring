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
public class Producto extends Entidad {
    
    private String nombre;

    private double precio;

    private int stock;

    public Producto(long id, String nombre, double precio, int stock) {
        super(id);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    
    /**
     * Get the value of stock
     *
     * @return the value of stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Set the value of stock
     *
     * @param stock new value of stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
