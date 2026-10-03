package controllers.Add_Member;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddMemberPageController {

    @FXML
    AddMemberController addMemberController = new AddMemberController();

    @FXML
    private Button btnRegister;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFullName;

    @FXML
    private TextField txtMemberId;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        String password = addMemberController.registerNewMember(txtMemberId.getText(), txtFullName.getText(), txtEmail.getText(), txtPhoneNumber.getText(), txtAddress.getText());
        addMemberController.setPopUpMessage(password);
    }

}

