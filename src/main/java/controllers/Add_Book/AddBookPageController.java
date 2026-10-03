package controllers.Add_Book;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddBookPageController {

    @FXML
    AddBookController addBookController = new AddBookController();

    @FXML
    private Button btnAddBook;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtYear;

    @FXML
    void btnAddBookOnAction(ActionEvent event) {
        addBookController.addNewBook(txtId.getText(), txtTitle.getText(), txtAuthor.getText(), txtCategory.getText(), txtYear.getText(), txtQty.getText());
        addBookController.setPopUpMessage();
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtCategory.setText("");
        txtYear.setText("");
        txtQty.setText("");
    }

}

