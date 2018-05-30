package ar.com.KevinRios.cursoJava.entities;


public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private int edad;

    public Persona(String nombre, String apellido, Direccion direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }
 
    public void saludar(){
        System.out.println("soy una persona");
    }            

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
