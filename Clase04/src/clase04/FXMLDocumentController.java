
package clase04;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * @author KevinRios
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtNombre;
    @FXML
    private CheckBox chkBici;
    @FXML
    private CheckBox chkMoto;
    @FXML
    private CheckBox chkAuto;
    @FXML
    private TextArea txaTexto;
    
    // inicio elementos de estado civil
    private ToggleGroup grupoEstado; 
    private List<CheckBox> listaCheck;
    
    @FXML
    private RadioButton radSoltero;
    @FXML
    private RadioButton radViudo;
    @FXML
    private RadioButton radCasado;
    @FXML
    private RadioButton radDivorciado;    
    // fin elementos de estado civil
    @FXML
    private ComboBox<String> cmbColores;
    
    
    @FXML
    private void aceptar(ActionEvent event){
        String nombre = txtNombre.getText();
        //JOptionPane.showMessageDialog(null, "hola "+nombre);
        
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setContentText("Ingresar nombre!");
        alerta.show();
        
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        armarGrupoEstado();        
        armarListaCheck();
        cargarCmbColores();
          
    }    

    private void armarListaCheck() {
        // armo la listaCheck
        listaCheck = new ArrayList();
        listaCheck.add(chkBici);
        listaCheck.add(chkAuto);
        listaCheck.add(chkMoto);
    }    

    private void armarGrupoEstado() {
        // armo el grupoEstado
        grupoEstado= new ToggleGroup();
        grupoEstado.getToggles().add(radSoltero);
        grupoEstado.getToggles().add(radCasado);
        grupoEstado.getToggles().add(radViudo);
        grupoEstado.getToggles().add(radDivorciado);
        //con esto seteo que este seleccionado soltero por default
        radSoltero.setSelected(true);
    }

    @FXML
    private void agregar(ActionEvent event) {
        String nombre= txtNombre.getText();
        if(nombre.length()<2){
            return;        
        }
        String texto="";
        texto+="Nombre: " + nombre + "\n";
        /*
        if(chkBici.isSelected()){            
            texto+= "Tiene Bici. \n";
        }
        if(chkMoto.isSelected()){
            texto+= "Tiene Moto. \n";
        }
        if(chkAuto.isSelected()){
            texto+= "Tiene Auto. \n";
        }
        */
        for (CheckBox cBox : listaCheck) {
            if (cBox.isSelected()) {    
                texto+="Tiene " + cBox.getText() + ". \n";             
            }
        }
        texto+= "Estado Civil: " 
                + ((RadioButton)grupoEstado.getSelectedToggle()).getText()
                +". \n";
        
       texto+= "Color: " + cmbColores.getValue()+ ". \n"; 
       
       String color= MapaColores.getMapa().get(cmbColores.getValue());
       txaTexto.setStyle("-fx-control-inner-background:"+ color+";");
       
       limpiar(); 
       txaTexto.setText(texto);
    }

    private void limpiar() {
        // limpio el nombre
        txtNombre.setText("");
        // limpio todas las opciones del chk
        for (CheckBox checkBox : listaCheck) {
            checkBox.setSelected(false);            
        }
        radSoltero.setSelected(true);
        cmbColores.getSelectionModel().selectFirst();
        // para que arranque el selector desde el nombre
        txtNombre.requestFocus();
    }

    private void cargarCmbColores() {
        cmbColores.getItems().addAll(MapaColores.getMapa().keySet());
        cmbColores.getSelectionModel().selectFirst();
    }
    
}
