package controllers.Login;

import controllers.Dashboard.DashBoardController;
import controllers.Dashboard.DashBoardPageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Member;

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

        Member loggedInMember = loginController.authenticate(txtUserName.getText(), txtPassWord.getText());

        if (loggedInMember != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Dashboard.fxml"));
                Parent root = loader.load();

                DashBoardPageController controller = loader.getController();
                controller.setLoggedInMember(loggedInMember);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            loginController.setPopUpMessage();
        }
    }

    @FXML
    void btnResetOnAction(ActionEvent event) {
        txtUserName.setText("");
        txtPassWord.setText("");
    }

    public void linkJoinOnAction(ActionEvent actionEvent) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/add_member_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
