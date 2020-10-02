package Controller;

import Model.Orden;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class OrdenDeCompraController {
    public TextField txtOC;
    public DatePicker dpFecha;
    public Label txtNitOrden;
    public TextField txtEnvio;
    public TableView<Orden> tblOrdenCompra;
    public ComboBox cbTipoEnvio;

    public void DatosEnvio(MouseEvent mouseEvent) {
        ObservableList<String> listadoTipoEnvio = FXCollections.observableArrayList("AEREO","MARITIMO","TERRESTRE");
        cbTipoEnvio.setItems( listadoTipoEnvio );

    }
}
