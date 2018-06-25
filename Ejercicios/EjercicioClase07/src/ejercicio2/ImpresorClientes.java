package ejercicio2;

import java.util.ArrayList;


public class ImpresorClientes {
    public static void main(String[] args) {
        
        Cliente cl1 = new Cliente("razon1", "direccion1");
        Cliente cl2 = new Cliente("razon2", "direccion2");
        Cliente cl3 = new Cliente("razon3", "direccion3");
        Cliente cl4 = new Cliente("razon4", "direccion4");
        Cliente cl5 = new Cliente("razon5", "direccion5");
        
        ArrayList<Cliente> listaClientes = new ArrayList();
        listaClientes.add(cl1);
        listaClientes.add(cl2);
        listaClientes.add(cl3);
        listaClientes.add(cl4);
        listaClientes.add(cl5);
        
        for (Cliente lsClientes : listaClientes) {
            System.out.println(lsClientes);
        }
       
        
    }   
}
