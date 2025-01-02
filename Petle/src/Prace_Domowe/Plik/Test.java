package Prace_Domowe.Plik;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku z rozszerzeniem (.txt): ");
        String fileName = sc.nextLine();

        System.out.println("0 - wyjscie");
        System.out.println("1 - dodaj plik");
        System.out.println("2 - usun plik");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 0) {
            System.out.println("Baj baj");
        }

        if (option == 1) {
            if (fileName.endsWith(".txt")) {
                createFile(fileName);
                System.out.println("Utworzono plik: " + fileName);
            } else {
                throw new UnsupportedFileFormatException("Brak lub zły format pliku: " + fileName);
            }
        }

        if (option == 2) {
            if (fileName.endsWith(".txt")) {
                deleteFile(fileName);
                System.out.println("Usunieto plik: " + fileName);
            } else {
                throw new UnsupportedFileFormatException("Brak lub zły format pliku: " + fileName);
            }
        }
    }

    private static boolean createFile(String fileName) {
        File file = new File(fileName);
        boolean fileExist = file.exists();

        if (!fileExist) {
            try {
                fileExist = file.createNewFile();
            } catch (IOException e) {
                System.err.println("Nie udalo sie");
            }
            return true;
        } else {
            return false;
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}
