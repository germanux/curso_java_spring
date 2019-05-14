/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
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
            fichero = new FileWriter("fichero_texto.txt", true);
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

    public static void escrituraStream() {

        String[] lineasTexto = {
            "Linea primera",
            "Linea segunda",
            "Tercera línea"};
        Writer out = null;
        try {
            FileOutputStream streamFich;
            streamFich = new FileOutputStream("fich_2.txt");
            OutputStreamWriter streamWriter;
            streamWriter = new OutputStreamWriter(streamFich, "UTF-8");
            out = new BufferedWriter(streamWriter, 10);
            out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("fich_2.txt"),
                            "UTF-8"));
            for (String linea : lineasTexto) {
                try {
                    out.write(linea + "\r\n");
                } catch (IOException ex) {
                    System.err.println("Error al escribir fich: " + ex.getMessage());
                }
            }
        } catch (UnsupportedEncodingException
                | FileNotFoundException ex2) {
            System.err.println("ERror 2: "
                    + ex2.getMessage());
        } finally {
            try {
                out.close();
                System.out.println("Fichero cerrado");
            } catch (IOException ex3) {
                System.err.println("Error en cierre fich:  " + ex3.getMessage());
            }
        }
    }

    public static void lecturaFich() {
        //File fichFormWin = new File("C:\\Users\\Admin\\Desktop\\curso_java_spring.git\\02_Colecciones\\fichero_texto.txt");
        //File fichFormJava = new File("C:/Users/Admin/Desktop/curso_java_spring.git/02_Colecciones/fichero_texto.txt");
        File fichRutaRelativa = new File("fich_2.txt");
        Scanner escaner = null;
        try {
            System.out.println("Leyendo fich");
            escaner = new Scanner(fichRutaRelativa);
            while (escaner.hasNextLine()) { // Hasta el siguiente \n
                String linea = escaner.nextLine();
                System.out.println(">>>> \"" + linea + "\"");
                if (linea.compareTo("Linea segunda") < 0)   
                    System.out.println("      es menor" );
                else if (linea.compareTo("Linea segunda") > 0)
                    System.out.println("      es mayor" );
                else System.out.println("      son iguales" );
            }
        } catch (Exception ex) {
            System.err.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        }
    }
}
