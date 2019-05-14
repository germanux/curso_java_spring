/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin - German
 */
public class Ficheros {

    public static void probarEscritura() throws IOException {
        String[] lineasTexto = {
            "Linea primera",
            "Linea segunda",
            "Tercera línea"};

        FileWriter fichero = null;
        try {
            fichero = new FileWriter("fichero_texto.txt"/*, false*/);
            for (int i = 0; i < 100000; i++) {
                for (String linea : lineasTexto) {
                    fichero.write(linea + "\r\n");
                }
            }
            fichero.write("FIN DEL FICHERRO" + "\r\n");
            // fichero.close();
        } catch (Exception ex) {
            System.err.println("Mensaje error: " + ex.getMessage());
        } finally {
            //try {
                fichero.close();
                System.out.println("Fichero cerrado");
            /*} catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }
}
