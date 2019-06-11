/* Clase patrón Singleton, sólo puede haber una
 * instancia (objeto) en toda la aplicación
 * de este tipo de clase
 */
package com.sinensia.api;

import java.util.ArrayList;

public class ServicioProductoSingleton {    
    
    private ArrayList<Producto> listaProductos;
    
    public void insertar(Producto p) {
        listaProductos.add(p);
        //listaProductos.toString();
    }
    
    public Producto modificar(Producto p) {
       for(int i =0;i<listaProductos.size();i++){
           
           //BUSCAMOS EL NOMBRE QUE SE LE PASA
          if(listaProductos.get(i).getId() == p.getId() ){
              listaProductos.set(i, p);
              return p;
          }           
       }
        return null;
    }
    public ArrayList<Producto> obtenerTodos() {        
        return  listaProductos;  
    }
    
    // La única instancia es privada.
    private static ServicioProductoSingleton instancia = null;    
    // Nadie puede hacer new excepto dentro de esta clase.
    // Puede ser protected
    private ServicioProductoSingleton() {
       this.listaProductos = new ArrayList<>();
    }
    // La primera vez que se llama al método, se crea la instancia A partir de ese momento hasta que la aplicación termine,
    // la instancia seguirá "viva" y es devuelta por el método, 
    // venga de donde venga la llamada.
    public static ServicioProductoSingleton getInstancia() {
        if (instancia == null )
            instancia = new ServicioProductoSingleton();
        return instancia;
    }
    
    public void eliminar(Producto p) {
      
       for(int i =0;i<listaProductos.size();i++){
           
           //BUSCAMOS EL NOMBRE QUE SE LE PASA
          if(listaProductos.get(i).getId() == p.getId() ){
              listaProductos.remove(listaProductos.get(i));
          }           
       }        
    }
}
