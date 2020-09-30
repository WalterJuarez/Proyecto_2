package Controller;

import Model.Clientes;
import Model.DataSistema;
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

public class IngresoClienteController extends DataSistema {

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    @FXML
    public TableView<Clientes> tblClientes;
    public TableColumn<Clientes, Integer> colId;
    public TableColumn<Clientes, String> colNit;
    public TableColumn<Clientes, String> colNombre;
    public TextField txtDpi;
    ;

    ArrayList<Clientes> listadoClientes = new ArrayList<>();

    public void IngresoClientes(ActionEvent actionEvent) {
        String tipoUsuario = "Particular";
        /*if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }*/
        if (txtNitUsuario.getText().equals("") || txtNombreUsuario.getText().equals("") || txtDireccionUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {
            Datos();
            listadoClientes.add(new Individual(txtDpi.getText(),txtNombreUsuario.getText(), txtNitUsuario.getText(), txtDireccionUsuario.getText(), tipoUsuario));
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
        }

        ObservableList<Clientes> cliente = FXCollections.observableArrayList(listadoClientes);
        colId.setCellValueFactory( new PropertyValueFactory<Clientes, Integer>("id") );
        colNit.setCellValueFactory( new PropertyValueFactory<Clientes, String>("nit") );
        colNombre.setCellValueFactory( new PropertyValueFactory<Clientes, String>("nombre") );
        tblClientes.setItems(cliente);
        System.out.println(listadoClientes.get(0));
    }

  
}
