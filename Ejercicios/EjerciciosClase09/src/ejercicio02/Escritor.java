package ejercicio02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

    public Escritor() {
    }

    public static void main(String[] args) throws IOException {

        File archivo = new File("resources/destino1.txt");
        
        String texto = "nuevo texto agregado";

        try (FileWriter salidaLectura = new FileWriter(archivo)) {
            for (int i = 0; i < texto.length(); i++) {
                salidaLectura.write(texto.charAt(i));
            }

        } catch (Exception e) {
        }

        
        

    }
}
