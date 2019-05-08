/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin
 */
public class Herencia {
    
    public static void probandoHerencia() {
        ClienteInvitado invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMax(10);
        System.out.println("Cliente: " + invitado.getNombre()
            + " duracion: " + invitado.getDuracionMax());
    }
}
