package ar.com.KevinRios.vehiculos.presentacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Control;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public abstract class EdicionControlador implements Initializable {

    private List<Control> campos;

    public EdicionControlador() {
        this.campos = new ArrayList<>();
    }

    protected void addCampo(Control field) {
        this.campos.add(field);
    }

    protected boolean validarCampos() {
        for (Control campo : campos) {
            if (campo instanceof TextField) {
                TextField c = (TextField) campo;
                try {
                    Integer.parseInt(c.getText());
                } catch (Exception NumberFormatException) {
                    validacionEnteroFalla(campo);
                    
                    return false;
                }

                if (c.getText().isEmpty()) {
                    validacionFalla(campo);
                    return false;
                }
            }
            if (campo instanceof TextArea) {
                TextArea c = (TextArea) campo;
                if (c.getText().isEmpty()) {
                    validacionFalla(campo);
                    return false;
                }
            }
        }
        return validacionOk();
    }

    private boolean validarNumeros() {
        return true;
    }

    private boolean validacionOk() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Esta a punto de guardar los cambios...");
        alert.setContentText("desea continuar?");
        Optional<ButtonType> result = alert.showAndWait();
        return (result.get() == ButtonType.OK);
    }

    private void validacionFalla(Control control) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Datos incompletos");
        alert.setHeaderText("Por favor complete todos los campos");
        alert.setContentText("El campo " + control.getTooltip().getText() + " no puede estar vacio.");
        alert.showAndWait();
        control.requestFocus();
    }
    
     private void validacionEnteroFalla(Control control) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error al Validar");
        alert.setHeaderText("Por favor ingresar un entero");
        alert.setContentText("El campo " + control.getTooltip().getText() + " tiene que ser un entero.");
        alert.showAndWait();
        control.requestFocus();
    }

}
