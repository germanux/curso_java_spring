/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.logica.ServicioClientes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteServicioTest {
    private static ServicioClientes servCli;
    
    @BeforeClass
    public static void setUpClass() {
        servCli = new ServicioClientes();
    }
    @Test
    public void clienteOk_1() {
        servCli.crear("Ok", "email@ok.com", "ok12", "30", "on");
        assertEquals(
                servCli.obtenerUno("email@ok.com").getNombre(), 
                "Ok");
    }
     @Test
    public void clienteMal_1() {
        servCli.crear("", "clienteMal_1@ok.com", "ok12", "30", "on");
         assertNull(servCli.obtenerUno("clienteMal_1@ok.com"));
    }
}
