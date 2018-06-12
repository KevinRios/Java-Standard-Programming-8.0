/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.KevinRios.vehiculo.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Kevin
 */
public class CompradoresVentanaController implements Initializable {
    
    private Label label;
    @FXML
    private Button btn_new;
    @FXML
    private Button btn_edit;
    @FXML
    private Button btn_delete;
    @FXML
    private Button btn_close;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirEdicion(ActionEvent event) {
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
    }
    
}
