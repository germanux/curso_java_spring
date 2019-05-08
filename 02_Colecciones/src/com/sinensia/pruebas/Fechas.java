/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.FechaSinMinutos;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Fechas {
    public static void probar() {
        FechaSinMinutos fecha = new FechaSinMinutos();
        fecha.set(2019, 9, 7);
        System.out.println("Fecha: " + fecha.toString());
        Date fechaDate =  fecha.getTime();
        System.out.println("Fecha: " + fechaDate.toString());
       
        FechaSinMinutos miCumple;
        miCumple = new FechaSinMinutos(2019, 9, 7);
        
        if (miCumple.equals(fecha)) {
            System.out.println("¡Cumpleaños feliz!");
        } 
        else if (miCumple.after(fecha)) {
            System.out.println("Aun no cumples");           
        } 
        else if (miCumple.before(fecha)) {
            System.out.println("Ya cumpliste");
        } 
    }
}
