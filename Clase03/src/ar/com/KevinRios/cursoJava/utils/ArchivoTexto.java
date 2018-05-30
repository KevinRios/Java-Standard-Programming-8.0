package ar.com.KevinRios.cursoJava.utils;

import ar.com.KevinRios.cursoJava.interfaces.I_Archivo;

public class ArchivoTexto implements I_Archivo{

    @Override
    public String getText() {
        return "Retornando ArchivoTexto";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo ArchivoTexto");
    }

    
       
}
