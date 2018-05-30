package ar.com.KevinRios.cursoJava.utils;

import ar.com.KevinRios.cursoJava.interfaces.I_Archivo;

// en esta clase voy a hacer la implementacion 
public class ArchivoBuffer implements I_Archivo{

    @Override
    public String getText() {
        return "Retornando ArchivoBuffer";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo ArchivoBuffer");
    }
    
}
