package Zadanie_Piec;

import Zadanie_Piec.Exceptions.UnavailableItemException;
import Zadanie_Piec.Items.Book;

public class Test {
    public static void main(String[] args) throws UnavailableItemException {
        Library library = new Library();
        library.controlLoop();
    }
}
