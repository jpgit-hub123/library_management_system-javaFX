package controllers.Add_Book;

import javafx.scene.control.Alert;
import model.Book;
import model.Member;

public class AddBookController {

    private static Book[] bookArray = new Book[0];

    public void addNewBook(String bookId, String title, String author, String category, String year, String qty) {
        saveMembersOnLibrary(new Book(bookId, title, author, category, Integer.parseInt(year), Integer.parseInt(qty)));
    }

    private void saveMembersOnLibrary(Book book) {
        extendBookArray(book);
    }

    private void extendBookArray(Book book) {
        Book[] temporaryBookArray = new Book[bookArray.length + 1];

        for (int i = 0; i < bookArray.length; i++) {
            temporaryBookArray[i] = bookArray[i];
        }

        temporaryBookArray[temporaryBookArray.length-1] = book;

        bookArray = temporaryBookArray;
    }

    public void setPopUpMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ALERT");
        alert.setHeaderText("Great!");
        alert.setContentText("Book is successfully added into the Library");
        alert.showAndWait();
    }
}
