package controllers.Login;

import controllers.Add_Member.AddMemberController;
import javafx.scene.control.Alert;
import model.Member;

public class LoginController {
    public void setPopUpMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WARNING");
        alert.setHeaderText("Oops!");
        alert.setContentText("Invalid username or password");
        alert.showAndWait();
    }

    public Member authenticate(String username, String password) {
        Member[] array = AddMemberController.getMemberArray();
        for (Member member : array) {
            if (username.equals(member.getMemberID()) && password.equals(member.getPassword())) {
                return member;
            }
        }
        return null;
    }
}
