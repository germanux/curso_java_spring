package pkg02_colecciones;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProbandoFechas.probar();
        probandoHerencia();
        /*
        ArrayList<Cliente> listaClientes;
        listaClientes = new ArrayList();
        
        listaClientes.add(new Cliente(1, "Ana", null));
        listaClientes.add(new Cliente(2, "Luis", null));
        listaClientes.add(new Cliente(3, "Bea", null));        
        
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Cliente " + i + ": " 
                + listaClientes.get(i).getNombre());
        }*/
        
    }
    public static void probandoHerencia() {
        ClienteInvitado invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMax(10);
        System.out.println("Cliente: " + invitado.getNombre()
            + " duracion: " + invitado.getDuracionMax());
    }
}
