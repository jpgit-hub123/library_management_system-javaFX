package controllers.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    @FXML
    LoginController loginController = new LoginController();

    @FXML
    private Button btnLogIn;

    @FXML
    private Button btnReset;

    @FXML
    private PasswordField txtPassWord;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLogInOnAction(ActionEvent event) {
        if (loginController.checkUserNameAndPassWord(txtUserName.getText(), txtPassWord.getText())) {
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        } else {
            loginController.setPopUpMessage();
        }
    }

    @FXML
    void btnResetOnAction(ActionEvent event) {
        txtUserName.setText("");
        txtPassWord.setText("");
    }

}
