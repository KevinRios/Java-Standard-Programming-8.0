package ar.com.KevinRios.cursoJava.entities;

public class Empleado extends Persona{
    
        private int nroLegajo;
        private float sueldoBasico;

        
    public Empleado(int nroLegajo, float sueldoBasico, String nombre, String apellido, Direccion direccion, int edad) {
        // con la anotacion super, invocamos el constructor de la clase padre
        super(nombre, apellido, direccion, edad);
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }
        
    @Override
    public void saludar(){
        System.out.println("Hola, soy un empleado");
    }

    @Override
    public String toString() {
        
        // al  hacer el toString de empleado, solo trae los datos propios de empleado
        // agrego super.toString + ...    para traer tambien los de persona
        return super.toString()+ "Empleado{" + "nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + '}';
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }
    
    
    
    
}
