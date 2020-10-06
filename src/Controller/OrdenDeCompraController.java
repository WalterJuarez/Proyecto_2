package Controller;

import Model.ItemOrden;
import Model.Orden;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static Model.DataSistema.listaProducto;
import static Model.DataSistema.listadoClientes;

public class OrdenDeCompraController {
    public TextField txtOC;
    public DatePicker dpFecha;
    public TextField txtNit;
    public TextField txtEnvio;
    public TableView<Orden> tblOrdenCompra;
    public ComboBox cbTipoEnvio;
    public TextField txtCant;
    public TableColumn colCant;
    public TableColumn colNombrePr;
    public TableColumn colPreUnit;
    public TableColumn colDescuento;
    public TableColumn colTotal;
    public TextField txtCodPro;


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
        String nit = txtNit.getText();
        for (int i = 0; i < listadoClientes.size(); i++)
            if (nit == listadoClientes.get( i ).getNit()) {
                System.out.println( nit );
            }

    }

}


