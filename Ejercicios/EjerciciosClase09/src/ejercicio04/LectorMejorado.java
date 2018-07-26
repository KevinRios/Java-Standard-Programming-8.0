package ejercicio04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorMejorado {

    public static void main(String[] args) throws Exception {

        File archivo = new File("resources/fuente.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        boolean fin = false;
        String linea = "";

        while (!fin) {
            // Lee una linea entera
            linea = br.readLine();

            // Imprime la linea en pantalla
            if (linea != null) {
                System.out.println(linea);
            } // Si llego al final del archivo, termina la ejecución
            else {
                fin = true;
            }
        }
        
        br.close();
    }

}
