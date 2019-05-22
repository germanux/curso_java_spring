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
        // assert = afirmar/asegurar
        assertNotNull(servCli.insertar("Ok", "email@ok.com", "ok12", "30", "on"));
        assertEquals( servCli.obtenerUno("email@ok.com").getNombre(), "Ok");
        servCli.eliminar("email@ok.com");
        assertNull(servCli.obtenerUno("email@ok.com"));
    }
    @Test
    public void clienteOk_2() {
        servCli.insertar("Cliente Ok", "email_1@ok.com", "ok12", "30", "on");
        servCli.insertar("Cliente Ok", "email_2@ok.com", "ok12", "25", "on");
        assertEquals( servCli.obtenerUno("email_1@ok.com").getEdad(), 30);
        assertTrue( servCli.obtenerUno("email_2@ok.com").getActivo() == 1);
        servCli.eliminar("email_1@ok.com");
        servCli.eliminar("email_2@ok.com");
        assertNull(servCli.obtenerUno("email_1@ok.com"));
        assertNull(servCli.obtenerUno("email_2@ok.com"));
    }
     @Test
    public void clienteMal_Nombre() {
        servCli.insertar("", "clienteMal_1@ok.com", "ok12", "30", "on");
         assertNull(servCli.obtenerUno("clienteMal_1@ok.com"));
    }
    @Test
    public void clienteMal_OtrosCampos() {
        servCli.insertar("Nombre bien", "", "ok12", "30", "on");
        assertNull(servCli.obtenerUno(""));
        servCli.insertar("Bien", "clien@ok.com", "", "30", "on");
        servCli.insertar("Ok", "client_2@ok.com", "ok12", "0", "on");
        servCli.insertar("Ok", "client_3@ok.com", "ok12", "NoNUM", "on");
        assertNull(servCli.obtenerUno("clien@ok.com"));
        assertNull(servCli.obtenerUno("client_2@ok.com"));
        assertNull(servCli.obtenerUno("client_3@ok.com"));
    }
}
