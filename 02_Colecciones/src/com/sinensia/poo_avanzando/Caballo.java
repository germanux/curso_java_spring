/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

/**
 *
 * @author Admin
 */
public class Caballo extends Mascota {

    public Caballo( String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " cabalga raudo");
    }

    @Override
    public void comer() {
 
        System.out.println(nombre + " pasta pasto");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar, loco!"); //To change body of generated methods, choose Tools | Templates.
    }

}
