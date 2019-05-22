package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.dao.InterfazDAO;
import com.sinensia.modelo.dao.MySQLClienteDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteDAOTest {    
    private static MySQLClienteDAO daoCli;
    
    @BeforeClass
    public static void setUpClass() {
        daoCli = new MySQLClienteDAO();
        assertNotNull("Error inicializacion DAO", daoCli);
    }  
    @Test
    // @Order(1)
    public void clienteBien_1() {
        assertNotNull(daoCli.insertar(new Cliente(null, "Pru", "prux@pru.com",
              (short) 20, (short) 1, "Pru123")));
        assertEquals("prux@pru", daoCli.obtenerUno("prux@pru.com").getEmail());
        daoCli.eliminar("prux@pru.com");
        assertNull(daoCli.obtenerUno("prux@pru.com"));
    }
    @Test
    public void clienteMal_1() {
        assertNull(daoCli.insertar(new Cliente(null, "", "prux@pru.com",
              (short) 20, (short) 1, "Pru123")));  
        assertEquals("prux@pru", daoCli.obtenerUno(1).getEmail());              
    }
}
