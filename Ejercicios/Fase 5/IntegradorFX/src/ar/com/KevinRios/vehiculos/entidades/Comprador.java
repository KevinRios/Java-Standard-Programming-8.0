package ar.com.KevinRios.vehiculos.entidades;

import ar.com.KevinRios.entidades.Persona;


public class Comprador extends Persona {

   
    public Comprador() {
    }

    public Comprador(String nombre, String apellido, String nroDocumento, double presupuesto) {
        super(nombre, apellido, nroDocumento);
        setPresupuesto(presupuesto);
    }

    // Atributos
    private double presupuesto;

    public String toString() {
        return super.toString() + " Presupuesto: $" + getPresupuesto();
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
