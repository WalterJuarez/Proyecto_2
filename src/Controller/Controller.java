package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;


public class Controller {
    public TextField txtUsuario;
    public PasswordField pwfPassword;

    public void ValidarUsuario(ActionEvent actionEvent) {
        try {
            if (txtUsuario.getText().equals("chis") && pwfPassword.getText().equals("1234")) {
                //JOptionPane.showMessageDialog(null, "Ingreso Correcto");

                //Visualizar menu principal
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../View/MenuPrincipal.fxml"));
                Pane root = (Pane) fxmlLoader.load();

                //Estructura FX
                Scene scene = new Scene(root, 800, 700);
                Stage stage = new Stage();
                stage.setTitle("Sistema de Ventas");
                stage.setScene(scene);
                stage.show();

                Stage stageLogin = (Stage)txtUsuario.getScene().getWindow();
                stageLogin.close();

            } else {
                JOptionPane.showMessageDialog(null, "Ingreso Invalido");
                txtUsuario.setText("");
                pwfPassword.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
