/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    
    protected int patas;
    protected boolean aerobico;
    protected boolean acuatico;
    protected String nombre;
    protected float tamanho;

    public Animal(String nombre, float tamanho) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.aerobico = false;
        this.acuatico = false;
        this.patas = 0;
    }
    public Animal(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        this.patas = patas;
        this.aerobico = aerobico;
        this.acuatico = acuatico;
        this.nombre = nombre;
        this.tamanho = tamanho;
    }  
    
    public abstract void mover();
    public abstract void comer();    
    public abstract void volar();
            
    
    public boolean isAnfibio() {
        return aerobico && acuatico;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isAerobico() {
        return aerobico;
    }

    public void setAerobico(boolean aerobico) {
        this.aerobico = aerobico;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
}
