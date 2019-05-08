/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin
 */
public class Polimorfismo {
    public static void polimorfeando() {
        ClienteInvitado invitado;
        invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMax(10);
        
        // Este es un objeto de tipo Cliente Invitado
        // con la forma de Cliente
        Cliente clienteNormal = invitado;
        System.out.println("Nombre: " 
                + clienteNormal.getNombre());
        
        ClienteInvitado elMismoInv = (ClienteInvitado) clienteNormal;
               
        
        Cliente normal = new Cliente(0, "Tu", null);
        ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
        System.out.println("Nombre: " 
                + normalEnIvit.getDuracionMax());
    }
}
