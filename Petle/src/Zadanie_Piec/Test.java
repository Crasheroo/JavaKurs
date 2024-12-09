package Zadanie_Piec;

import Zadanie_Piec.Exceptions.UnavailableItemException;
import Zadanie_Piec.Items.Book;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws UnavailableItemException {
        Library library = new Library();

        Scanner scanner = new Scanner(System.in);
        Library.Option option;

        do {
            library.printOptions();
            option = library.getOption();
            String title;

            switch (option) {
                case ADD_MOVIE:
                    library.addMovie();
                    break;
                case ADD_BOOK:
                    library.addBook();
                    break;
                case PRINT:
                    library.printItems();
                    break;
                case BORROW:
                    System.out.printf("Podaj tytul: ");
                    title = scanner.nextLine();
                    library.borrowItem(title);
                    break;
                case RETURN:
                    System.out.printf("Podaj tytul: ");
                    title = scanner.nextLine();
                    library.returnItem(title);
                    break;
                case NUMBER_OF_ITEMS:
                    library.printNumberOfItems();
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }

        } while (option != Library.Option.EXIT);

        scanner.close();
    }
}
