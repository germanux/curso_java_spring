package com.sinensia;

public class Cliente {
    private long id;    
    private String nombre;
    private String email;
    private boolean activo;

    /*public Cliente () { // Constructor por defecto
        
    }*/
    public Cliente(long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
    }
    public long getId() {
        return this.id;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
