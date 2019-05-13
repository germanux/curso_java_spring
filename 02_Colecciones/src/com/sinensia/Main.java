package com.sinensia;

import static com.sinensia.dao.ProbandoDAO.probarCliente;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzando.ProbandoAnimales;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Polimorfismo;

public class Main {

    public static void main(String[] args) {
        /*Polimorfismo.polimorfeandoConListas();
        Polimorfismo.clientes.add(new Cliente(7, "Yo", null));
        Polimorfismo.poliformHashMap();*/
        //Colecciones.ejemploListas();
        //Colecciones.ejemploSet();
        
        // Colecciones.ejemploHashMap();
        // ProbandoGenericos.probarMetodo();
        probarCliente() ;
        /*
        Colecciones.ejemploListas();
        Fechas.probar();
        probandoHerencia();*/
        //ProbandoAnimales.probarClasesAbstractas();
    }
}
