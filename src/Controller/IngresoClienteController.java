package Controller;

import Model.DataSistema;
import Model.Individual;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class IngresoClienteController extends DataSistema{

    public TextField txtNitUsuario;
    public TextField txtNombreUsuario;
    public TextField txtDireccionUsuario;
    @FXML
    public TableView<Individual> tblClientes = Datos();
    public TableColumn<Individual, Integer> colId;
    public TableColumn<Individual, String> colNit;
    public TableColumn<Individual, String> colNombre;
    public TextField txtDpi;
    public TableColumn<Individual, String> colDire;
    public ComboBox cbTipoCliente;
    public TableColumn colTipoCliente;

    @Override
    public TableView<Individual> Datos() {
        super.Datos();
        return null;
    }

    ;

    //ArrayList<Individual> listadoClientes = new ArrayList<>();


    public void IngresoClientes(ActionEvent actionEvent) {

        /*if(chbTipoUsuario.getOnAction().equals(true)){
            tipoUsuario = "Empresa";
        }*/
        if (!txtNitUsuario.getText().equals("") || !txtNombreUsuario.getText().equals("") || !txtDireccionUsuario.getText().equals("")|| !(cbTipoCliente.getValue() ==null)) {
            String tipoUsuario = "ub";
            listadoClientes.add(new Individual(txtDpi.getText(),txtNombreUsuario.getText(), txtNitUsuario.getText(), txtDireccionUsuario.getText(), tipoUsuario));
            //JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
            txtNitUsuario.setText( "" );
            txtNombreUsuario.setText( "" );
            txtDpi.setText( "" );
            txtDireccionUsuario.setText( "" );
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
