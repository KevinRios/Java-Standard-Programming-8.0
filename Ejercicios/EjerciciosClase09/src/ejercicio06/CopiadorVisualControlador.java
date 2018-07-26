package ejercicio06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class CopiadorVisualControlador implements Initializable {

    @FXML
    private Button btn_origen;
    @FXML
    private Button btn_destino;
    @FXML
    private Button btn_copiar;
    @FXML
    private TextField fld_origen;
    @FXML
    private TextField fld_destino;
    private String filename;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fld_origen.setEditable(false);
        fld_destino.setEditable(false);
    }

    @FXML
    private void btn_origen_pressed(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccione el archivo de origen");
        File file = fileChooser.showOpenDialog(btn_origen.getScene().getWindow());

        if (file != null) {
            fld_origen.setText(file.getAbsolutePath());
            this.filename = file.getName();
        }
    }

    @FXML
    private void btn_destino_pressed(ActionEvent event) {
        DirectoryChooser fileChooser = new DirectoryChooser();
        fileChooser.setTitle("Seleccione el directorio de destino");
        File file = fileChooser.showDialog(btn_destino.getScene().getWindow());

        if (file != null) {
            fld_destino.setText(file.getAbsolutePath());
        }
    }

    @FXML
    private void btn_copiar_pressed(ActionEvent event) {

        
        // Valida que las cajas de texto esten completas
        boolean validacionOk = validarFormulario();
        if (!validacionOk) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error de Validacion");
            alert.setContentText("Las dos cajas de texto deben estar completas");
            alert.showAndWait();
            return;
        }

        // Copia el archivo origen en el destino
        try {

            // Obtiene el nombre de archivo origen y genera el objeto del tipo File
            String origen = fld_origen.getText();
            File fileOrigen = new File(origen);

            // Obtiene el nombre de archivo destino y genera el objeto del tipo File
            String destino = fld_destino.getText() + "/Copia de "+ filename ;
            File fileDestino = new File(destino);

            // Arma los streams
            BufferedReader in = new BufferedReader(new FileReader(fileOrigen));
            BufferedWriter out = new BufferedWriter(new FileWriter(fileDestino));

            // Declara una variable para almacenar lo leido
            String lineaLeida;

            // Lee del stream de entrada y escribe en el stream de salida
            while ((lineaLeida = in.readLine()) != null) {
                out.write(lineaLeida);
                out.newLine();
            }

            // Cierra los streams
            in.close();
            out.close();

            // Informa que el archivo ha sido copiado
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Copia de archivos");
            alert.setHeaderText("Copia exitosa");
            alert.setContentText("El archivo ha sido copiado!");
            alert.showAndWait();
            // Limpia las cajas de texto
            fld_origen.setText("");
            fld_destino.setText("");
        } catch (FileNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No se ha podido relizar la copia");
            alert.setContentText("El archivo de origen no h sido encontrado!");
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No se ha podido relizar la copia");
            alert.setContentText("Error al realizar la copia");
            alert.showAndWait();

        }

    }

    private boolean validarFormulario() {
        if (fld_destino.getText().equals("") || fld_origen.getText().equals("")) {
            return false;
        }
        return true;
    }
}
