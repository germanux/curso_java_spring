/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteInvitado extends Cliente {
            
    // public String nombre;
    
    public ClienteInvitado(long id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    private int duracionMax;

    /**
     * Get the value of duracionMax
     *
     * @return the value of duracionMax
     */
    public int getDuracionMax() {
        return duracionMax;
    }

    /**
     * Set the value of duracionMax
     *
     * @param duracionMax new value of duracionMax
     */
    // @Override
    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }
    // Sobreescritura del método mostrar()
    @Override
    public void mostrar() {
        System.out.print("INVITADO ");
        super.mostrar();
        System.out.println("  Duración máxima " + duracionMax);
    }
}
