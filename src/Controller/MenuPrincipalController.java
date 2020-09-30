package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController  {
    public MenuItem opIngresoCliente;

    @FXML


    public void IngresoCliente() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/IngresoCliente.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 564, 600);
        Stage stage = new Stage();
        stage.setTitle("Ingreso Clientes");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void ListadoClientes()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/ListadoClientes.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 564, 291);
        Stage stage = new Stage();
        stage.setTitle("Listado Clientes");
        stage.setScene(scene);
        stage.show();

    }

    public void IngresoRespuesto(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/IngresoRepuesto.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 564, 291);
        Stage stage = new Stage();
        stage.setTitle("Listado Clientes");
        stage.setScene(scene);
        stage.show();
    }
}
