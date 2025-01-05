package Watki.MojeZadania.Projekt;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int option;

        do {
            System.out.println();
            System.out.println("Biblioteka");
            System.out.println("Wybierz co chcesz zrobic:");
            System.out.println("0 - Wyjście");
            System.out.println("1 - Dodaj ksiazke");
            System.out.println("2 - Usun ksiazke");
            System.out.println("3 - Znajdz ksiazke po tytule");
            System.out.println("4 - Dodaj uzytkownika");
            System.out.println("5 - Wyswietl ksiazki");
            System.out.println("6 - Pozycz ksiazke");
            System.out.println("7 - Oddaj ksiazke");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.printf("ID ksiazki: ");
                int bookId = sc.nextInt();
                sc.nextLine();

                System.out.printf("Tytul ksiazki: ");
                String bookTitle = sc.nextLine();

                System.out.printf("Autor ksiazki: ");
                String bookAuthor = sc.nextLine();
                Book book = library.addBook(bookId, bookTitle, bookAuthor);
            }

            if (option == 2) {
                System.out.printf("Podaj tytul ksiazki do usuniecia: ");
                String bookTitle = sc.nextLine();
                library.removeBook(bookTitle);
            }

            if (option == 3) {
                System.out.printf("Jakiej ksiazki szukasz? Podaj tytul: ");
                String bookTitle = sc.nextLine();
                library.findBookByTitle(bookTitle);
            }

            if (option == 4) {
                System.out.printf("Podaj id uzytkownika: ");
                int userId = sc.nextInt();

                System.out.printf("Podaj imie uzytkownika: ");
                String userName = sc.nextLine();

                User user = library.addUser(userId, userName);
                System.out.println("Dodano uzytkownika: " + user);
            }

            if (option == 5) {
                library.books.forEach(System.out::println);
            }

            if (option == 6) {
                System.out.printf("Podaj id uzytkownika: ");
                int userId = sc.nextInt();
                sc.nextLine();

                User user = library.findUserById(userId);
                if (user == null) {
                    System.out.println("nie znaleziono takiego uzytkownika");
                    break;
                }

                System.out.printf("Podaj tytul ksiazki do wypozyczenia: ");
                String bookTitle = sc.nextLine();

                Book book = library.findBookByTitle(bookTitle);
                if (book == null) {
                    System.out.println("nie znaleziono takiej ksiazki");
                    break;
                }

                user.borrowBook(book);
            }

            if (option == 7) {
                System.out.printf("Podaj id uzytkownika: ");
                int userId = sc.nextInt();
                sc.nextLine();

                User user = library.findUserById(userId);
                if (user == null) {
                    System.out.println("nie znaleziono takiego uzytkownika");
                    break;
                }

                System.out.printf("Podaj tytul ksiazki do oddania: ");
                String bookTitle = sc.nextLine();

                Book book = library.findBookByTitle(bookTitle);
                if (book == null) {
                    System.out.println("nie znaleziono takiej ksiazki");
                    break;
                }

                user.returnBook(book);
            }
        } while (option != 0);
    }
}
