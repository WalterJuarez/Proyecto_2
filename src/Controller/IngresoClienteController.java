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

public class IngresoClienteController extends DataSistema{

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    @FXML
    public TableView<Individual> tblClientes;
    public TableColumn<Individual, Integer> colId;
    public TableColumn<Individual, String> colNit;
    public TableColumn<Individual, String> colNombre;
    public TextField txtDpi;
    public TableColumn<Individual, String> colDire;
    ;

    ArrayList<Individual> listadoClientes = new ArrayList<>();


    public void IngresoClientes(ActionEvent actionEvent) {
        String tipoUsuario = "Particular";
        listadoClientes.add(new Individual("2666475020101","walter","38910632","Ciudad","individual"));
        listadoClientes.add(new Individual("6546146131222","Daniel","987532","Ciudad","individual"));
        listadoClientes.add(new Individual("63546542313","sheily","524288885","Ciudad","individual"));

        /*if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }*/


        if (txtNitUsuario.getText().equals("") || txtNombreUsuario.getText().equals("") || txtDireccionUsuario.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {

            listadoClientes.add(new Individual(txtDpi.getText(),txtNombreUsuario.getText(), txtNitUsuario.getText(), txtDireccionUsuario.getText(), tipoUsuario));
            //JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
            txtNitUsuario.setText( "" );
            txtNombreUsuario.setText( "" );
            txtDpi.setText( "" );
            txtDireccionUsuario.setText( "" );
        }

        ObservableList<Individual> cliente = FXCollections.observableArrayList(listadoClientes);
        colId.setCellValueFactory( new PropertyValueFactory<Individual, Integer>("id") );
        colNit.setCellValueFactory( new PropertyValueFactory<Individual, String>("nit") );
        colNombre.setCellValueFactory( new PropertyValueFactory<Individual, String>("nombre") );
        colDire.setCellValueFactory( new PropertyValueFactory<Individual, String>("direccion") );
        tblClientes.setItems(cliente);


    }

  
}
