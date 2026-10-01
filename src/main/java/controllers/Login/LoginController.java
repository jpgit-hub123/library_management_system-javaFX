package controllers.Login;

import javafx.scene.control.Alert;

public class LoginController {
    public boolean checkUserNameAndPassWord(String username, String password) {
        return username.equals("pathum") && password.equals("1234");
    }

    public void setPopUpMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WARNING");
        alert.setHeaderText("Oops!");
        alert.setContentText("Invalid username or password");
        alert.showAndWait();
    }
}
