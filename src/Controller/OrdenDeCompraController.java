package Controller;

import Model.Orden;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.Date;

public class OrdenDeCompraController {
    public TextField txtOC;
    public DatePicker dpFecha;
    public TextField txtNit;
    public TextField txtEnvio;
    public TableView<Orden> tblOrdenCompra;
    public ComboBox cbTipoEnvio;
    public TextField txtCant;


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
}
