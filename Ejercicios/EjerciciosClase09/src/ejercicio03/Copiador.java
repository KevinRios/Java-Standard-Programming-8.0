package ejercicio03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Copiador {

    public static void main(String[] args) throws Exception {

        File archivo = new File("resources/fuente.txt");
        FileReader fr = new FileReader(archivo);
        File archivoSalida = new File("resources/salida1.txt");
        FileWriter fw = new FileWriter(archivoSalida);
        
               
        // en esta variable se va guardando el caracter que se esta leyendo
        int letra;
        
        System.out.println(" -- Inicio copiado --");
        // Lee el archivo e informa
        while ((letra = fr.read()) != -1) {
            System.out.print((char) letra);
            fw.write(letra);
        }
        System.out.println(" -- Fin copiado --");
        
        //copio el contenido a otro archivo
        
        
        // Cierra el archivo
        fr.close();
        fw.close();
        

    }

}
