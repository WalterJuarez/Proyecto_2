package Controller;

import Model.DataSistema;
import Model.Individual;
import Model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.Collections;


public class IngresoRepuestosController extends DataSistema {
    @FXML
    public TextField txtNombreRepuesto;
    public TextField txtPrecio;
    public TextField txtCantidad;
    public TableView<Producto> tblRepuestos = DatosR();
    public TableColumn<Producto, Integer> colIdRepuestos;
    public TableColumn<Producto, String> colNombre;
    public TableColumn<Producto, Double> colPrecio;
    public TableColumn<Producto, Integer> colExistencia;

    public void initialize(){
        ObservableList<Producto> repuesto = FXCollections.observableArrayList(listaProducto);
        colIdRepuestos.setCellValueFactory( new PropertyValueFactory<Producto,Integer>("id"));
        colNombre.setCellValueFactory( new PropertyValueFactory<Producto, String>("nombreProducto"  ) );
        colPrecio.setCellValueFactory( new PropertyValueFactory<Producto, Double>("precio"  ) );
        colExistencia.setCellValueFactory( new PropertyValueFactory<Producto, Integer>("existencia"  ) );
        tblRepuestos.setItems( repuesto );
    }
    @Override
    public TableView<Individual> Datos() {
        return super.Datos();
    }


    public void IngresoProductos(ActionEvent actionEvent) {
        if(txtNombreRepuesto.getText().equals( "" )||txtPrecio.getText().equals( "" )||txtCantidad.getText().equals( "" )){
            //JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            listaProducto.add( new Producto( txtNombreRepuesto.getText(),Double.parseDouble(  txtPrecio.getText()),Integer.parseInt( txtCantidad.getText())));
            ObservableList<Producto> repuesto = FXCollections.observableArrayList(listaProducto);
            colIdRepuestos.setCellValueFactory( new PropertyValueFactory<Producto,Integer>("id"));
            colNombre.setCellValueFactory( new PropertyValueFactory<Producto, String>("nombreProducto"  ) );
            colPrecio.setCellValueFactory( new PropertyValueFactory<Producto, Double>("precio"  ) );
            colExistencia.setCellValueFactory( new PropertyValueFactory<Producto, Integer>("existencia"  ) );
            tblRepuestos.setItems( repuesto );
        }

    }




    public void Seleccionar (MouseEvent mouseEvent){
        Producto p = this.tblRepuestos.getSelectionModel().getSelectedItem();
        if (p != null) {
            this.txtNombreRepuesto.setText( p.getNombreProducto() );
            this.txtPrecio.setText( String.valueOf( p.getPrecio() ) );
            this.txtCantidad.setText( String.valueOf( p.getExistencia() ) );
        }
    }

    public void modificar(ActionEvent actionEvent) {
        Producto p = this.tblRepuestos.getSelectionModel().getSelectedItem();
        if (p == null) {
            Alert alert = new Alert( Alert.AlertType.ERROR );
            alert.setHeaderText( null );
            alert.setTitle( "Error" );
            alert.setContentText( "Debes seleccionar una fila para poder modificar" );
            alert.showAndWait();

        }else{

            String nombreRep = this.txtNombreRepuesto.getText();
            double precioRep = Double.parseDouble( this.txtPrecio.getText());
            int cantExis = Integer.parseInt( this.txtCantidad.getText());
            int posicion = 0;
            Producto aux = new Producto(nombreRep,precioRep,cantExis  );


        }
    }
}
