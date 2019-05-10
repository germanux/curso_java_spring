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
public class Tigre extends AnimalSalvaje 
        implements Depredador, Mamifero {

    public Tigre(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    @Override
    public void mover() {
        System.out.println(nombre + " corre veloz");
    }
    @Override
    public void comer() {
 
        System.out.println(nombre + " caza, mastica, engulle.");
    }
    @Override
    public void volar() {
        throw new UnsupportedOperationException("No puede volar, loco!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cazar(String presa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mamar(Mamifero mam) {
                
        if(mam instanceof Animal) {
            Animal anim = (Animal) mam;
            return "El tigre " + nombre + " mama de "+
                anim.getNombre();
        } else {
            return null;
        }
    }

    @Override
    public String nombrar() {
        return nombre;
    }
    
    
}
