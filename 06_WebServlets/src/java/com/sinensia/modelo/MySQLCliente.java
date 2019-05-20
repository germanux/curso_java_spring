package com.sinensia.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLCliente {

    public MySQLCliente() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver());
        } catch (SQLException ex) {
            Logger.getLogger(MySQLCliente.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLCliente.class.getName())
                    .log(Level.SEVERE, "Error en la clase", ex);
        } catch (Exception ex) {
            Logger.getLogger(MySQLCliente.class.getName())
                    .log(Level.SEVERE, "Otro error", ex);
        }
    }

    public boolean crear(String nombre, String email,
            String passwd, int edad, boolean activo) {
        try (Connection conex = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC",
                "admin", "Admin1234")) {
            String sqlQuery = 
                    "INSERT INTO cliente (nombre, email, password, edad, activo) "
                    + " VALUES ( '" + nombre + "' , '" + email + "' , '" + passwd
                    + "' , " + edad + " , " + (activo ? "1" : "0") + " ) ";
            Statement sentencia = conex.createStatement();
            sentencia.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLCliente.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return false;
        }
    }
}
