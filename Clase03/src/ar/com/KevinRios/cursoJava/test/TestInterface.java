package ar.com.KevinRios.cursoJava.test;

import ar.com.KevinRios.cursoJava.interfaces.I_Archivo;
import ar.com.KevinRios.cursoJava.utils.ArchivoBuffer;
import ar.com.KevinRios.cursoJava.utils.ArchivoTexto;

public class TestInterface {

    public static void main(String[] args) {
        I_Archivo archivo;
        
        archivo = new ArchivoTexto();
        //archivo = new ArchivoBuffer();
        archivo.setText("hola");
        System.out.println(archivo.getText());
        archivo.informacion();
    }
    
}
