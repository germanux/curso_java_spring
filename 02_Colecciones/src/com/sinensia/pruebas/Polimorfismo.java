/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVIP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Polimorfismo {
    public static final float PI = 3.1416f;
    public static ArrayList<Cliente> clientes;
    
    public static void polimorfeando() {
        ClienteInvitado invitado;
        invitado = new ClienteInvitado(100, "Juan", null);
        invitado.setDuracionMax(10);
        invitado.mostrar();
        // Este es un objeto de tipo Cliente Invitado
        // con la forma de Cliente
        Cliente clienteNormal = invitado;
        clienteNormal.mostrar();
        /*System.out.println("Nombre: " 
                + clienteNormal.getNombre());*/
        clienteNormal.getClass();
        ClienteInvitado mismoCliInvi = (ClienteInvitado) clienteNormal;

        ClienteInvitado elMismoInv = (ClienteInvitado) clienteNormal;

        /* Provoca una exepción de error de casting
        Cliente normal = new Cliente(0, "", null);
        ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
        System.out.println("Nombre: " 
                + normalEnIvit.getDuracionMax());*/
    }

    public static void polimorfeandoConListas() {
        clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1, "Ana", "aaa@aaa.com"));
        clientes.add(new Cliente(2, "Juan", "jjj@jjj.com"));
        clientes.add(new ClienteInvitado(3, "Bea", "bbb@bbb.com"));
        clientes.add(new ClienteInvitado(4, "Luis", "bbb@bbb.com"));
        clientes.add(new ClienteVIP(4, "Aria", "rrr@rrr.com", "Vengarse de sus enemigos"));
        for (Cliente cliente : clientes) {
            cliente.mostrar();
        } 
        // Probando HashMap        
    }
    public static void poliformHashMap() {
        
        HashMap<String, Cliente> diccClientes;
        diccClientes = new HashMap<String, Cliente>();
        for (Cliente cliente : clientes) {
            diccClientes.put(cliente.getNombre() + "-"+cliente.getId(), cliente);
        } 
        for (Map.Entry<String, Cliente> entradaCliente : diccClientes.entrySet()) {
            String clave = entradaCliente.getKey();
            System.out.println("Clave: " + clave);
            Cliente valor = entradaCliente.getValue();
            valor.mostrar();
        }
    }
}
