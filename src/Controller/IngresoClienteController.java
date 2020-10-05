package Controller;

import Model.DataSistema;
import Model.Empresa;
import Model.Individual;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class IngresoClienteController extends DataSistema{
    @FXML
    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    public TextField txtDpi;
    public TableView<Individual> tblClientes = Datos();
    public TableColumn<Individual, Integer> colId;
    public TableColumn<Individual, String> colNit;
    public TableColumn<Individual, String> colNombre;
    public TableColumn<Individual, String> colDire;
    public TableColumn colTipoCliente;

    public ComboBox cbTipoCliente;


    @Override
    public TableView<Individual> Datos() {
        super.Datos();
        return null;
    }

    ;
    @FXML

    public void IngresoClientes(ActionEvent actionEvent) {
        String tipoUsusario;
        String dpiContacto = txtDpi.getText();
        String nit = txtNitUsuario.getText();
        String nombre = txtNombreUsuario.getText();
        String direccion = txtDireccionUsuario.getText();
        if (!txtNitUsuario.getText().equals("") || !txtNombreUsuario.getText().equals("") || !txtDireccionUsuario.getText().equals("")|| !(cbTipoCliente.getValue() ==null)) {
            if (cbTipoCliente.getValue().equals("Particular")){
                tipoUsusario = "Particular";
            }else{
                tipoUsusario = "Empresa";
            }

                listadoClientes.add(new Individual(dpiContacto, nombre,nit, direccion, tipoUsusario));

                //JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
                txtNitUsuario.setText("");
                txtNombreUsuario.setText("");
                txtDpi.setText("");
                txtDireccionUsuario.setText("");
                cbTipoCliente.setValue(null);

        }
    }


    public void Actualizar(ActionEvent actionEvent) {

        ObservableList<Individual> cliente = FXCollections.observableArrayList( listadoClientes );
        colId.setCellValueFactory( new PropertyValueFactory<Individual, Integer>( "id" ) );
        colNit.setCellValueFactory( new PropertyValueFactory<Individual, String>( "nit" ) );
        colNombre.setCellValueFactory( new PropertyValueFactory<Individual, String>( "nombre" ) );
        colDire.setCellValueFactory( new PropertyValueFactory<Individual, String>( "direccion" ) );
        colTipoCliente.setCellValueFactory( new PropertyValueFactory<Individual, String>( "tipoUsuario" ) );
        tblClientes.setItems( cliente );
    }


    public void TipoCliente(MouseEvent mouseEvent) {
        ObservableList<String> listadoTiposCliente = FXCollections.observableArrayList("Particular","Empresa");
        cbTipoCliente.setItems( listadoTiposCliente );

    }


}
