package ar.com.KevinRios.vehiculos.presentacion.controladores;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class CompradoresEdicionControlador extends ConcesionariaControlador implements Initializable {

    @FXML
    private TextField fld_nombre;
    @FXML
    private TextField fld_apellido;
    @FXML
    private TextField fld_dni;
    @FXML
    private TextField fld_presupuesto;
    @FXML
    private Button btn_ok;
    @FXML
    private Button btn_cancel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        fld_nombre.setTooltip(new Tooltip("Nombre"));
        fld_apellido.setTooltip(new Tooltip("Apellido"));
        fld_dni.setTooltip(new Tooltip("DNI"));
        fld_presupuesto.setTooltip(new Tooltip("Presupuesto"));
    }

    @FXML
    private void aceptar(ActionEvent event) {
        boolean ok = validaDecimales();
        if(ok){
            cerrarVentana(event);
        }
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Stage stage = (Stage) btn_cancel.getScene().getWindow();
        stage.close();
    }

    public boolean validaDecimales() {
        try {
            Double.parseDouble(fld_presupuesto.getText());
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos incompletos");
            alert.setHeaderText("Error, Ingresar un valor valido");
            alert.setContentText("El campo presupuesto tiene que ser un numero con decimales");
            alert.showAndWait();
            fld_presupuesto.requestFocus();
            return false;
        }
        return validacionOk();

    }

    
    private boolean validacionOk() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Esta a punto de guardar los cambios...");
        alert.setContentText("desea continuar?");
        Optional<ButtonType> result = alert.showAndWait();
        return (result.get() == ButtonType.OK);
    }
}
