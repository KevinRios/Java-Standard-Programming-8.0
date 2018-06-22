
package ar.com.KevinRios.vehiculos.presentacion.controladores;

import ar.com.KevinRios.vehiculos.presentacion.ventanas.Ventanas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class VentanaMaestraControlador extends ConcesionariaControlador implements Initializable {

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void abrirVentanaAutos(ActionEvent event) {
        super.mainApp.mostrarVentanaInterna(Ventanas.AutosVentana);
    }

    @FXML
    private void abrirVentanaVendedores(ActionEvent event) {
        super.mainApp.mostrarVentanaInterna(Ventanas.VendedoresVentana);
    }

    @FXML
    private void abrirVentanaCompradores(ActionEvent event) {
        super.mainApp.mostrarVentanaInterna(Ventanas.CompradoresVentana);
    }

    @FXML
    private void abrirVentanaConfiguracion(ActionEvent event) {
        super.mainApp.mostrarVentanaInterna(Ventanas.ConfiguracionVentana);
    }
    
    @FXML
    private void salir(ActionEvent event) {
        Platform.exit();
    }

}
