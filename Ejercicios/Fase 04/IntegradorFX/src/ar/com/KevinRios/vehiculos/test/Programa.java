
package ar.com.KevinRios.vehiculos.test;

import ar.com.KevinRios.vehiculos.entidades.Auto;
import ar.com.KevinRios.vehiculos.entidades.Comprador;
import ar.com.KevinRios.vehiculos.entidades.Vendedor;


public class Programa {

    
    public Programa() {
    }

    
    public static void main(String[] args) {

        System.out.println("\nCreando un auto....");
        Auto a1 = new Auto("Chevrolet", "Corsa 5P", "Gris", 320, 190, 100);
        System.out.println(a1);

        
        System.out.println("\nCreando un vendedor....");
        Vendedor v1 = new Vendedor("Mario", "Mendoza", "25.689.845", 3);
        System.out.println(v1);

        
        System.out.println("\nCreando un ofertante....");
        Comprador o1 = new Comprador("Mario", "Mendoza", "25.689.845", 20545);
        System.out.println(o1);

    }

}
