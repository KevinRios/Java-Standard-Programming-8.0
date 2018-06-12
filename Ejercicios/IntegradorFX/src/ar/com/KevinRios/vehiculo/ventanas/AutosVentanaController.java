
package ar.com.KevinRios.vehiculo.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class AutosVentanaController implements Initializable {
    
    private Label label;
    @FXML
    private Button btn_new;
    @FXML
    private Button btn_edit;
    @FXML
    private Button btn_delete;
    @FXML
    private Button btn_close;
    @FXML
    private TextArea txt_description;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirAutosEdicion(ActionEvent event) {
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
    }
    
}
