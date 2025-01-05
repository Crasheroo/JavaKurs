package Watki.MojeZadania.Projekt;

import java.util.Objects;

public class Book {
    private int ID;
    private String bookTitle;
    private String bookAuthor;
    private int copiesAvailable;

    public Book() {}

    public Book(int ID, String bookTitle, String bookAuthor) {
        this.ID = ID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", copiesAvailable=" + copiesAvailable +
                '}';
    }
}
