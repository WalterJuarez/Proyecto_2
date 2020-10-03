package Controller;

import Model.Orden;
import Model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.Date;

import static Model.DataSistema.listaProducto;

public class OrdenDeCompraController {
    public TextField txtOC;
    public DatePicker dpFecha;
    public TextField txtNit;
    public TextField txtEnvio;
    public TableView<Producto> tblOrdenCompra;
    public ComboBox cbTipoEnvio;
    public TextField txtCant;
    public TableColumn colCant;
    public TableColumn colNombrePr;
    public TableColumn colPreUnit;
    public TableColumn colDescuento;
    public TableColumn colTotal;


    ArrayList<Orden> listaOrdenes = new ArrayList<>();

    public void DatosEnvio(MouseEvent mouseEvent) {
        ObservableList<String> listadoTipoEnvio = FXCollections.observableArrayList("AEREO","MARITIMO","TERRESTRE");
        cbTipoEnvio.setItems( listadoTipoEnvio );


    }

    public void Crear(ActionEvent actionEvent) {
        int idOC = new Orden().getId();
        txtOC.setText(String.valueOf(idOC));
        String fechaOrd = dpFecha.getAccessibleText();
        int Cantidad = Integer.parseInt(txtCant.getText());

    }

    public void AgregarItem(ActionEvent actionEvent) {
        ObservableList<Producto> listadoLineasPedido = FXCollections.observableArrayList(listaProducto);
        colCant.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        colNombrePr.setCellValueFactory(new PropertyValueFactory<>("id"));
        tblOrdenCompra.setItems(listadoLineasPedido);

    }
}
