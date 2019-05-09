/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Colecciones {
    
    public static void ejemploHashMap() {
        HashMap<String, Cliente> diccClientes;
        diccClientes = new HashMap<String, Cliente>();
        Cliente ana = new Cliente(1, "Ana", null); 
        Cliente luis = new Cliente(2, "Luis", null); 
        Cliente bea = new Cliente(3, "Bea", null); 
        
        diccClientes.put("c3", bea);
        diccClientes.put("a1", ana);
        diccClientes.put("b2", luis);
        
        System.out.println("Bea? " + diccClientes.get("c3").getNombre());
        
        if ( ! diccClientes.containsKey("c3")) {
            diccClientes.put("c3", new Cliente(4, "Pedro", null));
        }
        System.out.println("Bea? " + diccClientes.get("c3").getNombre());
        
        for (Map.Entry<String, Cliente> parClaveValor  : diccClientes.entrySet()) 
        {
            System.out.println("Cliente " + parClaveValor.getKey());
            Cliente cliente = parClaveValor.getValue();
            System.out.println("  Nombre: " + cliente.getNombre());
        }        
    }
    public static void ejemploListas() {        
        ArrayList<Cliente> listaClientes;
        listaClientes = new ArrayList();
        
        listaClientes.add(new Cliente(1, "Ana", null));
        listaClientes.add(new Cliente(2, "Luis", null));
        listaClientes.add(new Cliente(3, "Bea", null));   
        Cliente clientePepe = new Cliente(3, "Pepe", null);
        listaClientes.add(clientePepe);
        listaClientes.add(clientePepe);     
        
        listaClientes.remove(1);
        Cliente bea = listaClientes.get(1);
        bea.setEmail("bb@bb.com"); 
        
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            System.out.println("Cliente " + i + ": " 
                // + listaClientes.get(i).getNombre());
                + cliente.getNombre()
                + ", " + cliente.getEmail()
            );
        }
        for (Cliente cliente : listaClientes) {
            
            System.out.println("Cliente: " 
                + cliente.getNombre());
        }
    }
    
    public static void ejemploSet() {
        // Conjunto de elemntos únicos
        HashSet<Cliente> conjuntoClientes = new HashSet<Cliente>();
        conjuntoClientes.add(new Cliente(1, "juan", null));
        conjuntoClientes.add(new Cliente(2, "ana", null));
        Cliente clientePepe = new Cliente(3, "Pepe", null);
        conjuntoClientes.add(clientePepe);
        conjuntoClientes.add(clientePepe);
       /* for (Cliente cli : conjuntoClientes) {
            cli.mostrar();
        }*/
        Iterator<Cliente> iter = conjuntoClientes.iterator();
        while (iter.hasNext()) {
            Cliente cli = iter.next();
            cli.mostrar();
        }
    }
}
