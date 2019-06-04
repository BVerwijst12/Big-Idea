package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    public Button BtLogin;
    public TextField TbName;
    public TextField TbPassword;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Login(ActionEvent actionEvent) {
        System.out.println("User" + TbName.getText() + "logged in");
    }
}
