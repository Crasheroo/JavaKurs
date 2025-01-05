package Watki.MojeZadania.Projekt;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private final List<Book> borrowedBooks;

    public synchronized void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println(name + " już wypożyczył tę książkę: " + book.getBookTitle());
        } else {
            borrowedBooks.add(book);
            System.out.println(name + " wypożyczył książkę: " + book.getBookTitle());
        }
    }

    public synchronized void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + "zwrocil książkę: " + book.getBookTitle());
        } else {
            System.out.println(name + " nie posiadał: " + book.getBookTitle());
        }
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
