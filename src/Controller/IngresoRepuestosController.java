package Controller;

import Model.DataSistema;
import Model.Individual;
import Model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;



public class IngresoRepuestosController extends DataSistema {
    @FXML
    public TextField txtNombreRepuesto;
    public TextField txtPrecio;
    public TextField txtCantidad;
    public TableView<Producto> tblRepuestos;
    public TableColumn<Producto, Integer> colIdRepuestos;
    public TableColumn<Producto, String> colNombre;
    public TableColumn<Producto, Double> colPrecio;
    public TableColumn<Producto, Integer> colExistencia;


    @Override
    public TableView<Individual> Datos() {
        return super.Datos();
    }

    public void IngresoProductos(ActionEvent actionEvent) {
        if(txtNombreRepuesto.getText().equals( "" )||txtPrecio.getText().equals( "" )||txtCantidad.getText().equals( "" )){
            //JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            listaProducto.add( new Producto( txtNombreRepuesto.getText(),Double.parseDouble(  txtPrecio.getText()),Integer.parseInt( txtCantidad.getText())));
        }

    }

    public void Actualizar(ActionEvent actionEvent) {
        ObservableList<Producto> repuesto = FXCollections.observableArrayList(listaProducto);
        colIdRepuestos.setCellValueFactory( new PropertyValueFactory<Producto,Integer>("id"));
        colNombre.setCellValueFactory( new PropertyValueFactory<Producto, String>("nombreProducto"  ) );
        colPrecio.setCellValueFactory( new PropertyValueFactory<Producto, Double>("precio"  ) );
        colExistencia.setCellValueFactory( new PropertyValueFactory<Producto, Integer>("existencia"  ) );
        tblRepuestos.setItems( repuesto );
    }
}
