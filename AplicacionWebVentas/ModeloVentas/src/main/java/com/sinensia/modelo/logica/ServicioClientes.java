package com.sinensia.modelo.logica;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;

public class ServicioClientes {
    private ClienteDAO dao;
    public ServicioClientes() {
        dao = new ClienteDAO();
    }
    public void crear(String nombre, String email, 
            String passwd, String edad, String activo ) {
        if (nombre == null || nombre.equals("")) {
            return;
        }
        short iEdad = Short.parseShort(edad);
        if (iEdad <= 0) {
            return;
        }
        short iActivo = (short) ("on".equals(activo) ? 1 : 0);
        //TODO: Faltan ciertas validaciones
        Cliente nuevoCli = new Cliente(null, nombre, email, iEdad, iActivo, passwd);
        dao.poner(nuevoCli);
    }
    public Cliente obtenerUno(int id) {
        return dao.leerUno(id);
    }
    public Cliente obtenerUno(String email) {
        //TODO: Implementar en el DAO
        for (Cliente c : dao.leerTodos()) {
            if (c.getEmail().equals(email))
                return c;
        }
        return null;
    }
}
