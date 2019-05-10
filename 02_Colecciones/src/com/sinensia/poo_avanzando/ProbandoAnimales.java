/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import com.sinensia.Cliente;
import com.sun.security.ntlm.Client;

/**
 *
 * @author Admin
 */
public class ProbandoAnimales {
    
    public static void probarClasesAbstractas ()  {
        Tucan unTucan = new Tucan("Turigualpa", 15.8f);
        unTucan.mover();
        TortugaNinja michelangelo 
                = new TortugaNinja("Michelangelo", 175.5f);
        michelangelo.mover();
        
        Caballo rocinante = new Caballo("Rocinante", 3f);
        rocinante.mover();
        rocinante.comer();
        
        Cliente yo = new Cliente(3, "Yo", null);
        Animal miMascota = new Dragon("Drogo", 4959);
        ((Mascota) miMascota).setPropietario(yo);
    }  
}
