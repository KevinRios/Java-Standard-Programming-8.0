package ejercicio05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {

    public static void main(String[] args) throws IOException {

        File archivo = new File("resources/destino2.txt");
        FileWriter fw = new FileWriter(archivo);

        String l1 = "Linea 1";
        String l2 = "Linea 2";
        String l3 = "Linea 3";

        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(l1, 0, l1.length());
            bw.newLine();
            bw.write(l2, 0, l2.length());
            bw.newLine();
            bw.write(l3, 0, l3.length());
        } catch (Exception e) {
        }

    } // end main
} // end class EscritorMejorado
