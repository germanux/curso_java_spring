/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.dao;

import java.util.List;

/**
 * Interfaz Data Access Object para toda la app
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */
public interface InterfazDAO<T> {
    
    T insertar(T valor);
    T obtenerUno(Integer id);
    List<T> obtenerTodos();
    void eliminar(T valor);
    void eliminar(Integer id);
    T modificar(/*long id,*/ T nuevoValor);
}
