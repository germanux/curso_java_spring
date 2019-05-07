package pkg01_ejemplojava;

/**
 * Un pajaro exótico
 * @author German
 */
public class Tucan extends Object {
    
    String[] colores;
    float longitud;
    int edad;
    
    public Tucan() {
        this.edad = 0;
        longitud = 5f;
        colores = new String[] {
            "blanco", "marron"
        };
        
    }
    
/** 
 * Un pajaro dice pío y su edad
 * @author German
 */
    public void piar() {
        System.out.println("Pio pio "
                + edad + " años");
    }
}
