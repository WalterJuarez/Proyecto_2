package Controller;

import Model.DataSistema;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Pane layout = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        Scene scene = new Scene(layout, 442, 260);

        //Estructura FX
        primaryStage.setTitle("Sistema de Ventas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args);
    }
}
