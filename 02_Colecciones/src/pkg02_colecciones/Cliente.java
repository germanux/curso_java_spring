package pkg02_colecciones;

public class Cliente {
    private long id;    
    private String nombre;
    private String email;
    private boolean activo;

    public Cliente(long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
    }
    public long getId() {
        return this.id;
    }
    public String getNombre() {
        return nombre;
    }
    
    
}
