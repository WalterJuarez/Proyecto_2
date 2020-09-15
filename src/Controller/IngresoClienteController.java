package Controller;

import Model.Clientes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import javax.swing.*;
import java.util.ArrayList;

public class IngresoClienteController {

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    public CheckBox chbTipoUsuario;
    ArrayList<Clientes> listadoClientes = new ArrayList<>();

    public void IngresoClientes(ActionEvent actionEvent){
        String tipoUsuario = " ";
        if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }else {
            tipoUsuario = "Particular";
        }
        if ( txtNitUsuario.getText().equals("")||txtNombreUsuario.getText().equals("")||txtDireccionUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            listadoClientes.add(new Clientes(txtNombreUsuario.getText(),txtNitUsuario.getText(),txtDireccionUsuario.getText(),tipoUsuario));
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
        }
    }

    public void ListadoClientes(){
        
    }
}
