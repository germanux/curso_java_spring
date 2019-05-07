package pkg01_ejemplojava;

public class Main {

    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true; 
        if ( 3 > 5 ) {
            if (condicion || false) {
                System.out.println("Es verdadero");
            }
        } else if (5 > 7) {
            System.out.println("No se ejecuta");            
        } else if (8 > 9) {
            System.out.println("No se ejecuta"); 
        } else {
            System.out.println("Cualquier otro caso");
        }
        char letra = 'B';
        switch (letra) {
            case 'A': 
                System.out.println("Aaaaaa");
                break;
            case 'B': 
                System.out.println("Bbbbbbb");
                break;
            case 'C': 
                System.out.println("Ccccc");
                break;
        }  
        String formateado = nombreApell("German", "Caballero Rodriguez");
        System.out.println(formateado);
        
        Tucan miPajaro = null;
        miPajaro  = new Tucan();
        miPajaro.longitud = 20.5F;
        System.out.println("Long tucan:" 
            + miPajaro.longitud);
        
        Tucan otro_pajaro = null;
        // otroPajaro.longitud = 30.9F;
        otro_pajaro = new Tucan();
        otro_pajaro.longitud = 30.9F;
                
        System.out.println("Mi tucan:" 
            + miPajaro.longitud);
        System.out.println("Otro tucan:" 
            + otro_pajaro.longitud);
        
        System.out.println("Otro tucan:" 
            + otro_pajaro);
        
        otro_pajaro = miPajaro;
        
        System.out.println("Otro tucan:" 
            + otro_pajaro.longitud);
        miPajaro.longitud = 67.6F;
        System.out.println("Otro tucan:" 
            + otro_pajaro.longitud);
         
        otro_pajaro.edad = 11;
        System.out.println("Edad tucan:" 
            + miPajaro.edad);
        otro_pajaro.piar();
        miPajaro.piar();
        
        Tucan nuevoTuc = new Tucan();
        
        System.out.println("Nuevo tucan:" 
            + nuevoTuc.longitud);
    }
   static String nombreApell(String nombre, String apellidos) {
       return apellidos + ", " + nombre;
   }            
}
