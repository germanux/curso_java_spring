/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
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
public class ClienteUnitTest {
    
    public ClienteUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void probarJUnit() {
        assertEquals(10, 10);
        assertEquals("Texto", "Texto");
        // assertEquals("Texto", "tExto"); // ERROR Test
        assertNotEquals("Texto", "tExto");
    }
    @Test
    public void probarClienteDAO() {
        ClienteDAO daoCli = new ClienteDAO();
        daoCli.insertar(new Cliente(1, "Pru", "pru@pru",
              (short) 20, (short) 1, "Pru123"));
        daoCli.insertar(new Cliente(2, "Pru2", "pru2@pru",
              (short) 22, (short) 0, "Pru123"));
        
        assertEquals("2", daoCli.obtenerTodos().size());   
        Cliente  cli = daoCli.obtenerUno(2);
        assertTrue(cli.getEmail().equals("pru2@pru"));        
    }
}
