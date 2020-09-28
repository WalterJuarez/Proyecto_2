package Controller;

import Model.Clientes;
import com.sun.imageio.stream.StreamCloser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.ClosePath;

import javax.swing.*;
import java.util.ArrayList;

public class IngresoClienteController {

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    public CheckBox chbTipoUsuario;
    ArrayList<Clientes> listadoClientes = new ArrayList<>();

    public void IngresoClientes(ActionEvent actionEvent){
        String tipoUsuario = "Particular";
        /*if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }*/
        if ( txtNitUsuario.getText().equals("")||txtNombreUsuario.getText().equals("")||txtDireccionUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            listadoClientes.add(new Clientes(listadoClientes.size(),txtNombreUsuario.getText(),txtNitUsuario.getText(),txtDireccionUsuario.getText(),tipoUsuario));
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
        }

    }
    TableView<Clientes> clientesTableView = new TableView<>();
    ObservableList<Clientes> clientesObservableList = FXCollections.observableArrayList();

    public void ListaClientes(){
        clientesTableView.setItems(clientesObservableList);

        //creador de columnas
        TableColumn idCliente = new TableColumn("ID");
        idCliente.setCellValueFactory(new PropertyValueFactory<Clientes,String>("id"));
        idCliente.setMinWidth((clientesTableView.getMaxWidth()/4));
    }
}
