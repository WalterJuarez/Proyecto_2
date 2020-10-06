package Controller;
import Model.DataSistema;
import com.sun.javafx.scene.EnteredExitedHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;


public class MenuPrincipalController {
    public MenuItem opIngresoCliente;
    public MenuItem opSalir;

    @FXML


    public void IngresoCliente() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/IngresoCliente.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 585, 575);
        Stage stage = new Stage();
        stage.setTitle("Ingreso Clientes");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void IngresoRespuesto(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/IngresoRepuesto.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 585, 575);
        Stage stage = new Stage();
        stage.setTitle("Listado de Repuestos");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void OrdenesDeCompra() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/OrdenDeCompra.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        //Estructura FX
        Scene scene = new Scene(root, 625, 575);
        Stage stage = new Stage();
        stage.setTitle("Orden de Compra");
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void Cerrar(ActionEvent actionEvent) {
        System.exit( 0 );
    }
}
