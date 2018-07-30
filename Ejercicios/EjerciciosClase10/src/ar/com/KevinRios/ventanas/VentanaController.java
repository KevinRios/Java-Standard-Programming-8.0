package ar.com.KevinRios.ventanas;

import ar.com.KevinRios.entidades.Cliente;
import ar.com.KevinRios.entidades.Hijo;
import ar.com.KevinRios.entidades.Persona;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rodolfo Durante
 */
public class VentanaController implements Initializable {

    @FXML
    private TextField fld_nombre;
    @FXML
    private TextField fld_apellido;
    @FXML
    private ComboBox<Persona.SEXO> cmb_sexo;
    @FXML
    private ComboBox<Persona.ESTADOCIVIL> cmb_estado_civil;
    @FXML
    private CheckBox chk_tarjeta_de_credito;
    @FXML
    private CheckBox chk_debito_automatico;
    @FXML
    private CheckBox chk_transferencia_bancaria;
    @FXML
    private ComboBox<Hijo> cmb_hijos_jardin;
    @FXML
    private ComboBox<Hijo> cmb_hijos_primaria;
    @FXML
    private ComboBox<Hijo> cmb_hijos_secundaria;
    @FXML
    private Button btn_promover_jardin;
    @FXML
    private Button btn_promover_primaria;
    @FXML
    private TextArea txt_datos;
    @FXML
    private Button btn_guardar;
    private VentanaPrincipal mainApp;
    private Hijo hijoSinSeleccionar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        cmb_sexo.getItems().setAll(Persona.SEXO.values());
        cmb_estado_civil.getItems().setAll(Persona.ESTADOCIVIL.values());

        // Pone el valor <sin seleccionar> en los combos de hijos
        hijoSinSeleccionar = new Hijo("<seleccionar>", Hijo.LUGAR_ESTUDIO.JARDIN);
        cmb_hijos_jardin.getItems().add(hijoSinSeleccionar);
        cmb_hijos_jardin.setValue(hijoSinSeleccionar);
        cmb_hijos_primaria.getItems().add(hijoSinSeleccionar);
        cmb_hijos_primaria.setValue(hijoSinSeleccionar);

        cmb_hijos_secundaria.getItems().add(hijoSinSeleccionar);
        cmb_hijos_secundaria.setValue(hijoSinSeleccionar);
        cargarCliente();

    }

    private Cliente obtenerCliente() {
      
        Cliente cliente = new Cliente();
        cliente.setNombre("Kevin");
        cliente.setApellido("Rios");
        cliente.setEstadoCivil(Persona.ESTADOCIVIL.CASADO);
        cliente.setSexo(Persona.SEXO.MASCULINO);
        cliente.setFormaPagoDebito(false);
        cliente.setFormaPagoCredito(false);
        cliente.setFormaPagoTransferencia(false);

        ArrayList hijos = new ArrayList();
        hijos.add(new Hijo("Jonatan", Hijo.LUGAR_ESTUDIO.JARDIN));
        hijos.add(new Hijo("Ivan", Hijo.LUGAR_ESTUDIO.JARDIN));
        hijos.add(new Hijo("Esteban", Hijo.LUGAR_ESTUDIO.PRIMARIA));
        hijos.add(new Hijo("Tomas", Hijo.LUGAR_ESTUDIO.PRIMARIA));
        hijos.add(new Hijo("Ramon", Hijo.LUGAR_ESTUDIO.SECUNDARIA));
        hijos.add(new Hijo("Hernan", Hijo.LUGAR_ESTUDIO.SECUNDARIA));
        cliente.setHijos(hijos);

        return cliente;

    }

    public void cargarCliente() {

        Cliente c1 = obtenerCliente();
        fld_nombre.setText(c1.getNombre());
        fld_apellido.setText(c1.getApellido());
        cmb_sexo.setValue(c1.getSexo());
        cmb_estado_civil.setValue(c1.getEstadoCivil());
        chk_debito_automatico.setSelected(c1.isFormaPagoDebito());
        chk_tarjeta_de_credito.setSelected(c1.isFormaPagoCredito());
        chk_transferencia_bancaria.setSelected(c1.isFormaPagoTransferencia());

        // Agrega los hijos
        Iterator it = c1.getHijos().iterator();
        while (it.hasNext()) {
            // Obtiene un hijo
            Hijo hijo = (Hijo) it.next();
            switch (hijo.getLugarDeEstudio()) {
                case JARDIN:
                    cmb_hijos_jardin.getItems().add(hijo);
                    break;
                case PRIMARIA:
                    cmb_hijos_primaria.getItems().add(hijo);
                    break;
                case SECUNDARIA:
                    cmb_hijos_secundaria.getItems().add(hijo);
                    break;
            }
        }

    }

    private void mostrarDatosDelHijo(Hijo hijo) {
        if (!hijo.equals(hijoSinSeleccionar)) {
            txt_datos.setText(hijo.getNombre());
        }
    }

    private void moverHijoDeCombo(Hijo hijo) {
        if (hijo.getLugarDeEstudio() == Hijo.LUGAR_ESTUDIO.JARDIN) {
            // Quita el hijo del combo Jardin
            cmb_hijos_jardin.getItems().remove(hijo);
            // Agrega el hijo en el combo Primario y lo selecciona
            hijo.setLugarDeEstudio(Hijo.LUGAR_ESTUDIO.PRIMARIA);
            cmb_hijos_primaria.getItems().add(hijo);
            cmb_hijos_primaria.setValue(hijo);
        } else {
            // Quita el hijo del combo Primaria
            cmb_hijos_primaria.getItems().remove(hijo);
            // Agrega el hijo en el combo Secundario y lo selecciona
            hijo.setLugarDeEstudio(Hijo.LUGAR_ESTUDIO.SECUNDARIA);
            cmb_hijos_secundaria.getItems().add(hijo);
            cmb_hijos_secundaria.setValue(hijo);
        }
    }

    @FXML
    private void btnPromoverJardinPressed(ActionEvent event) {
        Hijo h = cmb_hijos_jardin.getValue();
        // Si no hay un hijo seleccionado, entonces muestra un mensaje de advertencia
        if (h == null || h.equals(hijoSinSeleccionar)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("No se puede promover al Hijo");
            alert.setContentText("Debe haber un hijo seleccionado");
            alert.showAndWait();
        } else {
            moverHijoDeCombo(h);
        }
    }

    @FXML
    private void btnPromoverPrimariaPressed(ActionEvent event) {
        Hijo h = cmb_hijos_primaria.getValue();
        // Si no hay un hijo seleccionado, entonces muestra un mensaje de advertencia
        if (h == null || h.equals(hijoSinSeleccionar)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("No se puede promover al Hijo");
            alert.setContentText("Debe haber un hijo seleccionado");
            alert.showAndWait();
        } else {
            moverHijoDeCombo(h);
        }
    }

    @FXML
    private void btnGuardarPressed(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmacion");
        alert.setHeaderText("Actualización");
        alert.setContentText("Confirma actualización de datos?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {

          
            Alert ok = new Alert(Alert.AlertType.INFORMATION);
            ok.setTitle("Informacion");
            ok.setHeaderText(null);
            ok.setContentText("Los datos han sido actualizados");
            ok.showAndWait();
        } 

    }

    @FXML
    private void cmbHijosJardinActionPerformed(ActionEvent evt) {
        SingleSelectionModel<Hijo> selection = cmb_hijos_jardin.getSelectionModel();
        Hijo h = selection.getSelectedItem();
        mostrarDatosDelHijo(h);

    }

    @FXML
    private void cmbHijosPrimariaActionPerformed(ActionEvent evt) {
        SingleSelectionModel<Hijo> selection = cmb_hijos_primaria.getSelectionModel();
        Hijo h = selection.getSelectedItem();
        mostrarDatosDelHijo(h);

    }

    @FXML
    private void cmbHijosSecundariaActionPerformed(ActionEvent evt) {
        SingleSelectionModel<Hijo> selection = cmb_hijos_secundaria.getSelectionModel();
        Hijo h = selection.getSelectedItem();
        mostrarDatosDelHijo(h);
    }

}
