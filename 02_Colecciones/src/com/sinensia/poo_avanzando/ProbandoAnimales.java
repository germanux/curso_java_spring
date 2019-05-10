/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import com.sinensia.Cliente;

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
        try {
            unTucan.volar();
            michelangelo.volar();
        } catch (UnsupportedOperationException error) {
            System.err.println(error.getMessage());            
        } catch (StringIndexOutOfBoundsException ex) {            
            System.err.println(" Error en el String " + ex.getMessage());  
        } catch (Exception ex) {            
            System.err.println(" Error general " + ex.getMessage());  
        } finally {
            System.out.println("Siempre me ejecuto. Cerremos recursos");
        }
        
        Caballo rocinante = new Caballo("Rocinante", 3f);
        rocinante.mover();
        rocinante.comer();
        
        Cliente yo = new Cliente(3, "German", null);
        Animal miDragon = new Dragon("Drogo", 4959);
        Mascota miMascota = (Mascota) miDragon;
        miMascota.setPropietario(yo);
        ((Mascota) miDragon).saludarAlPropietario();
        ((Mascota) miDragon).pedirComida();
        miDragon.volar();
        
        Tigre tigre = new Tigre("Tigretón", 2.55f);
        
        System.out.println("¿Que mama el tigre?" 
                + tigre.mamar(rocinante));
        
        System.out.println("¿Que mama el caballo?" 
                + rocinante.mamar(tigre));
        
    }  
}
