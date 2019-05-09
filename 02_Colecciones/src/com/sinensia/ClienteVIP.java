/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteVIP extends Cliente {

    private String beneficios;

    public ClienteVIP(long id, String nombre, String email) {
        super(id, nombre, email);
        beneficios = "";
    }    
    public ClienteVIP(long id, String nombre, String email, String beneficios) {
        super(id, nombre, email);
        this.beneficios = beneficios;
    }    

    public String getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
