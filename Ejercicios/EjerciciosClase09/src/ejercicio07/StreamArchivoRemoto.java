package ejercicio07;

import java.net.*;
import java.io.*;

public class StreamArchivoRemoto {

    public StreamArchivoRemoto() {
    }

    public static void main(String[] args) {
        try {

            // Construye un objeto del tipo URL
            URL url = new URL("http://www.clarin.com");
            InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream());
            
            BufferedReader br = new BufferedReader(isr);

          
            boolean eof = false;
            String linea;

            // Lee el contenido del archivo y lo imprime en pantalla
            while (!eof) {
                // Lee una linea
                linea = br.readLine();

                // Imprime la linea en pantalla
                if (linea != null) {
                    System.out.println(linea);
                } // Termina la ejecución
                else {
                    eof = true;
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("La url no es válida:" + e.toString());
        } catch (IOException e) {
            System.out.println("No se puede leer de Internet: " + e.toString());
        }
    }
}
