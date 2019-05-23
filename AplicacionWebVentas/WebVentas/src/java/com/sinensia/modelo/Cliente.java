/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.modelo;

import java.io.Serializable;
import java.util.List;

public class Cliente extends Entidad implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nombre;
    
    private String email;
    
    private short edad;
    
    private short activo;
    
    private String password;
    
    public Cliente() {
    }

    public Cliente(Integer id) {
        super(id);
    }

    public Cliente(Integer id, String nombre, String email, short edad, short activo, String password) {
        super(id);
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.activo = activo;
        this.password = password;
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

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente[ id=" + id + ", "
                + nombre + ", "
                + email + ", "
                + password + ", "
                + edad + ", "
                + activo + "]";
    }
}
