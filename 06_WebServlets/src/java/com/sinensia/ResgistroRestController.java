/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin - German
 */
@WebServlet(asyncSupported = true, urlPatterns = "/api/registro")
public class ResgistroRestController extends HttpServlet {

    class Cliente {

        private String nombre;
        private String email;
        private String activo;
        private String edad;

        public Cliente() {
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getActivo() {
            return activo;
        }

        public void setActivo(String activo) {
            this.activo = activo;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

    }

    @Override
    protected void doPut(HttpServletRequest peticion,
            HttpServletResponse respuesta)
            throws ServletException, IOException {
        respuesta.setContentType("application/json;charset=UTF-8");
        BufferedReader reader = peticion.getReader();
        
                
        String json = "", lineaJson = reader.readLine();
        while (lineaJson != null) {
            json += lineaJson;
            lineaJson = reader.readLine();
        }
        System.out.println("- - - JSON :" + json);
        Gson gson = new Gson();
        Cliente cli = gson.fromJson(json, Cliente.class);
        System.out.println("- - Email :" + cli.email);
        cli.setEmail("otro@email.com");
        
        respuesta.getWriter().print(gson.toJson(cli));
    }

}
