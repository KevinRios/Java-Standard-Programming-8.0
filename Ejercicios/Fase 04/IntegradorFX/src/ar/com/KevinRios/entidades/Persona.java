package ar.com.KevinRios.entidades;

public abstract class Persona {

   
    public Persona() {
    }

    public Persona(String nombre, String apellido, String numeroDocumento) {
        setNombre(nombre);
        setApellido(apellido);
        setNumeroDocumento(numeroDocumento);
    }

    // Atributos
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    // metodo toString()
    public String toString() {
        return nombre + " " + apellido + " DNI:" + numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
