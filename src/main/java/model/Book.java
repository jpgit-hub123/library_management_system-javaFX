package model;

public class Book {

    private String bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookCategory;
    private int bookPublishedYear;
    private int bookQuantity;

    public Book(String bookID, String bookTitle, String bookAuthor, String bookCategory, int bookPublishedYear, int bookQuantity) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookPublishedYear = bookPublishedYear;
        this.bookQuantity = bookQuantity;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookPublishedYear(int bookPublishedYear) {
        this.bookPublishedYear = bookPublishedYear;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

}
