package Zadanie_Piec;

import Zadanie_Piec.Exceptions.UnavailableItemException;
import Zadanie_Piec.Items.Book;
import Zadanie_Piec.Items.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public List<LibraryItem> libraryItems = new ArrayList<>();

    public void controlLoop() throws UnavailableItemException {
        Scanner scanner = new Scanner(System.in);
        String title;
        Option option;

        do {
            printOptions();
            option = getOption();

            switch (option) {
                case ADD_MOVIE:
                    addMovie();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT:
                    printItems();
                    break;
                case BORROW:
                    System.out.printf("Podaj tytul:");
                    title = scanner.nextLine();
                    borrowItem(title);
                    break;
                case RETURN:
                    System.out.printf("Podaj tytul:");
                    title = scanner.nextLine();
                    returnItem(title);
                    break;
                case NUMBER_OF_ITEMS:
                    printNumberOfItems();
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }

        } while (option != Option.EXIT);
    }

    private void addMovie() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj tutyl: ");
        String title = scanner.nextLine();

        System.out.printf("Podaj rezysera: ");
        String director = scanner.nextLine();

        System.out.printf("Podaj czas w minutach: ");
        double time = scanner.nextDouble();

        libraryItems.add(new Movie(title, director, time));
    }

    private void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tutyl: ");
        String title = scanner.nextLine();

        System.out.println("Podaj autora: ");
        String author = scanner.nextLine();

        System.out.println("Podaj liczbe stron: ");
        int pages = scanner.nextInt();

        libraryItems.add(new Book(title, author, pages));

    }

    private void printItems() {
        System.out.println("Dostepne itemy:");
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.isAvailable) {
                System.out.println(libraryItem);
            }
        }
        System.out.println("Niedostepne itemy:");
        for (LibraryItem libraryItem : libraryItems) {
            if (!libraryItem.isAvailable) {
                System.out.println(libraryItem);
            }
        }
    }

    private void printNumberOfItems() {
        int bookCount = 0;
        int movieCount = 0;

        for (LibraryItem item : libraryItems) {
            if (item instanceof Book) {
                bookCount++;
            } else if (item instanceof Movie) {
                movieCount++;
            }
        }

        System.out.println("Liczba ksiazek: " + bookCount);
        System.out.println("Liczba filmow: " + movieCount);
        System.out.println("Liczba wszystkich elementow: " + libraryItems.size());
    }

    private void borrowItem(String title) throws UnavailableItemException {
        LibraryItem item = searchItemByTitle(title);
        item.borrow();
    }

    private void returnItem(String title) throws UnavailableItemException {
        LibraryItem item = searchItemByTitle(title);
        item.returnItem();
    }

    private LibraryItem searchItemByTitle(String title) throws UnavailableItemException {
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getTitle().equals(title)) {
                return libraryItem;
            }
        }
        throw new UnavailableItemException("Nie ma takiego czegos");
    }

    private Option getOption() {
        Scanner scanner = new Scanner(System.in);
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            option = Option.fromInt(scanner.nextInt());
            scanner.nextLine();
            optionOk = true;
        }
        return option;
    }

    private void printOptions() {
        System.out.println("Wybierz opcje:");
        for (Option option : Option.values()) {
            System.out.println(option.toString());
        }
    }

    private enum Option {
        ADD_MOVIE(1, "Dodaj film"),
        ADD_BOOK(2, "Dodaj ksiazke"),
        PRINT(3, "Wyswietl wszystkie elementy"),
        BORROW(4, "Wypozycz element"),
        RETURN(5, "Zwroc element"),
        NUMBER_OF_ITEMS(6, "Wyswietl liczbe elementow"),
        EXIT(0, "Wyjdz z programu");

        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }

        static Option fromInt(int option) {
            for (Option opt : Option.values()) {
                if (opt.value == option) {
                    return opt;
                }
            }
            throw new IllegalArgumentException("Nie ma opcji o podanej wartości: " + option);
        }
    }
}
