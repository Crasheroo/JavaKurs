package Watki.MojeZadania.Projekt;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public synchronized Book addBook(int id, String bookTitle, String bookAuthor) {
        Book book = new Book(id, bookTitle, bookAuthor);
        books.add(book);
        System.out.printf("Dodano ksiazke: " + book);
        return book;
    }

    public synchronized void removeBook(String bookTitle) {
        Book bookToRemove = findBookByTitle(bookTitle);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Usunięto książkę: " + bookToRemove);
        } else {
            System.out.println("Nie znaleziono książki o tytule: " + bookTitle);
        }
    }

    public synchronized User addUser(int id, String name) {
        User user = new User(id, name);
        users.add(user);
        return user;
    }

    public synchronized Book findBookByTitle(String bookTitle) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    public synchronized User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
