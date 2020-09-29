package Controller;

import Model.Clientes;
import Model.Individual;
import javafx.beans.DefaultProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.util.ArrayList;

public class IngresoClienteController {

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    @FXML
    public TableView<Individual> tblClientes;
    public TableColumn colId;
    public TableColumn colNit;
    public TableColumn colNombre;
    private ObservableList<Individual> cliente;

    ArrayList<Clientes> listadoClientes = new ArrayList<>();

    public void IngresoClientes(ActionEvent actionEvent) {
        String tipoUsuario = "Particular";
        /*if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }*/
        if (txtNitUsuario.getText().equals("") || txtNombreUsuario.getText().equals("") || txtDireccionUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {
            listadoClientes.add(new Clientes(txtNombreUsuario.getText(), txtNitUsuario.getText(), txtDireccionUsuario.getText(), tipoUsuario));
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
        }



    }



    public void lista (){
        cliente = FXCollections.observableArrayList();
        this.colId.setCellFactory( new PropertyValueFactory("id"  ) );
        this.colNit.setCellFactory( new PropertyValueFactory("nit"  ) );
        this.colNombre.setCellFactory( new PropertyValueFactory("nombre"  ) );
        this.tblClientes.setItems( cliente );
    }

  
}
