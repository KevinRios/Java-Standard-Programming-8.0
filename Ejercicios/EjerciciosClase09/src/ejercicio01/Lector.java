package ejercicio01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

    public Lector() {
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        
        File archivo = new File("resources/fuente.txt");
        
        // se lee el archivo
        FileReader fr = new FileReader(archivo);
         
        int letra;

        // Lee el archivo e informa
        while ((letra = fr.read()) != -1) {
            System.out.print((char) letra);
        }

        // Cierra el archivo
        fr.close();

        
        
    }

}
