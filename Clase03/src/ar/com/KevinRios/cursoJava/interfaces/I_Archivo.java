package ar.com.KevinRios.cursoJava.interfaces;

public interface I_Archivo {
    /*
    Una interface es un contrato de métodos.
    Todos los miembros de una interface son publicos.
    No pueden existir constructores ni atributos, solo  métodos publicos.
    Los Métodos no tienen codigo, la clase que implementa la interface
    es la que escribe el código.
    Una clase puede implementar todas las interfaces que necesite.
    */
    
    public String getText();
    public void setText(String text);
    
    // Métodos default (jdk8 o superior)
    //  Los métodos default tienen codigo adentro del método
    
    public default void informacion(){
        System.out.println("Interface I_Archivo");
    }    
}
