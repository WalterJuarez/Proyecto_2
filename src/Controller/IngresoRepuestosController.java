package Controller;

import Model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class IngresoRepuestosController {
    public TextField txtNombreRepuesto;
    public TextField txtPrecio;
    public TextField txtCantidad;
    public TableView<Producto> tblRepuestos;
    public TableColumn<Producto, Integer> colIdRepuestos;
    public TableColumn<Producto, String> colNombre;
    public TableColumn<Producto, Double> colPrecio;
    public TableColumn<Producto, Integer> colExistencia;

    ArrayList<Producto> listadoProducto = new ArrayList<>();

    public void IngresoProductos(javafx.event.ActionEvent actionEvent) {
        if(txtNombreRepuesto.getText().equals( "" )||txtPrecio.getText().equals( "" )||txtCantidad.getText().equals( "" )){
            //JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            listadoProducto.add( new Producto( txtNombreRepuesto.getText(),Double.parseDouble(  txtPrecio.getText()),Integer.parseInt( txtCantidad.getText())));
        }
        ObservableList<Producto> repuesto = FXCollections.observableArrayList(listadoProducto);
        colIdRepuestos.setCellValueFactory( new PropertyValueFactory<Producto,Integer>("id"));
        colNombre.setCellValueFactory( new PropertyValueFactory<Producto, String>("nombreProducto"  ) );
        colPrecio.setCellValueFactory( new PropertyValueFactory<Producto, Double>("precio"  ) );
        colExistencia.setCellValueFactory( new PropertyValueFactory<Producto, Integer>("existencia"  ) );
        tblRepuestos.setItems( repuesto );
    }
}
