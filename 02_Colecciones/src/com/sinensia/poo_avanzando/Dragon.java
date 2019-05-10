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
public class Dragon extends Mascota implements Depredador {

    public Dragon(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    
    public Dragon(String nombre, float tamanho, int patas) {
        super(patas, true, false, nombre, tamanho);
    }
    @Override
    public void mover() {
        System.out.println(nombre + " vuela asustando a la peña");
    }
    @Override
    public void comer() { 
        System.out.println(nombre + " quema y luego te come");
    }
    @Override
    public void volar() {
        System.out.println(nombre + " vuela, te quema y te come");
    }
    @Override
    public void saludarAlPropietario() {
  
        System.out.println(propietario.getNombre()
            + " te saluda con una mirada chunga "
                + nombre  + "!!!");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre
            + " quema, vuela y caza a " + presa);
    }
}
