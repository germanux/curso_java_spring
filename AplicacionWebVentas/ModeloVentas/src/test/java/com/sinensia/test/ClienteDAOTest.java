package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteDAOTest {    
    private static ClienteDAO daoCli;
    
    @BeforeClass
    public static void setUpClass() {
        daoCli = new ClienteDAO();
        assertNotNull("Error inicializacion DAO", daoCli);
    }  
    @Test
    // @Order(1)
    public void clienteBien_1() {
        daoCli.insertar(new Cliente(null, "Pru", "pru@pru.com",
              (short) 20, (short) 1, "Pru123"));        
        assertEquals("pru@pru", daoCli.obtenerUno(1).getEmail());
        daoCli.eliminar(1);
        assertNull(daoCli.obtenerUno(1));
    }
    @Test
    public void clienteMal_1() {
        daoCli.insertar(new Cliente(null, "", "pru@pru.com",
              (short) 20, (short) 1, "Pru123"));  
        assertEquals("pru@pru", daoCli.obtenerUno(1).getEmail());              
    }
}
