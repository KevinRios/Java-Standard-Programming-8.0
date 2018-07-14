
package ar.com.KevinRios.vehiculos.presentacion.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;


public class AutosEdicionControlador extends EdicionControlador {

    @FXML
    private TextField fld_alto;
    @FXML
    private TextField fld_largo;
    @FXML
    private TextField fld_ancho;
    @FXML
    private ComboBox<?> cmb_marca;
    @FXML
    private ComboBox<?> cmb_modelo;
    @FXML
    private ComboBox<?> cmb_color;
    @FXML
    private TextField fld_precio;
    @FXML
    private TextArea txt_equipamiento;
    @FXML
    private Button btn_ok;
    @FXML
    private Button btn_cancel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fld_alto.setTooltip(new Tooltip("Alto"));
        fld_largo.setTooltip(new Tooltip("Largo"));
        fld_ancho.setTooltip(new Tooltip("Ancho"));
        fld_precio.setTooltip(new Tooltip("Precio"));
        txt_equipamiento.setTooltip(new Tooltip("Equipamiento"));

        addCampo(fld_alto);
        addCampo(fld_largo);
        addCampo(fld_ancho);
        addCampo(fld_precio);
        addCampo(txt_equipamiento);
    }

   

    @FXML
    private void aceptar(ActionEvent event) {
        boolean ok = validarCampos();
        if (ok) {
            cerrarVentana(event);
        }
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) btn_cancel.getScene().getWindow();
        stage.close();
    }
}
