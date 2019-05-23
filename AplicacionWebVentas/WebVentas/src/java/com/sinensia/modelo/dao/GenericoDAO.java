/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.modelo.dao;

import com.sinensia.modelo.Entidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin - German
 * @param <T>  El tipo hereda de Entidad
 */
public class GenericoDAO<T extends Entidad> 
        implements InterfazDAO<T>{
    
    HashMap<Integer, T> mapa;

    public GenericoDAO() {
        mapa = new HashMap<>();
    }
    static int contadorIds;
    @Override
    public T insertar(T cli) {
        contadorIds++;
        if (cli == null) {
            System.err.println("No se pueden añadir nulos");
        } else {
            mapa.put(contadorIds, cli);
            cli.setId(contadorIds);
            return cli;
        }
        return null;
    }

    @Override
    public T obtenerUno(Integer id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/ID no encontrado " + id);
        return null;
    }

    @Override
    public void eliminar(T cliente) {
        mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(Integer id ) {
        mapa.remove(id);
    }

    @Override
    public List<T> obtenerTodos() {
        ArrayList<T> lista;
        lista = new ArrayList<>();
        for (Map.Entry<Integer, T> ent : mapa.entrySet()) {
            lista.add(ent.getValue());
        }
        return lista;   // Cast implicito
    }
    @Override
    public T modificar(T nuevoValor) {
        
        mapa.replace(nuevoValor.getId(), nuevoValor);
        return nuevoValor;
        
        /*T cli = mapa.get(nuevoValor.getId()) ;        
        cli.setActivo(nuevoValor.isActivo());
        cli.setEmail(nuevoValor.getEmail());
        cli.setNombre(nuevoValor.getNombre());*/
    }
}
