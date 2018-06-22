
package ar.com.KevinRios.vehiculos.entidades;

import ar.com.KevinRios.entidades.Persona;


public class Vendedor extends Persona {

    
    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String nroDocumento, int cantAutosVendidos) {
        super(nombre, apellido, nroDocumento);
        setCantAutosVendidos(cantAutosVendidos);
    }

    // Atributos
    private int cantAutosVendidos;

    public String toString() {
        return super.toString() + ", autos vendidos: " + cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

}
