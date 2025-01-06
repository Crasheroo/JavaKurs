package Watki.MojeZadania.Zadanie14;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Gra w liczby");
        System.out.println("Wybierz poziom trudnosci:");
        System.out.println("0 - Wyjscie");
        System.out.println("1 - Latwy");
        System.out.println("2 - Sredni");
        System.out.println("3 - Trudny");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 0: {
                break;
            }

            case 1: {
                checkNumber(10);
                break;
            }

            case 2: {
                checkNumber(50);
                break;
            }

            case 3: {

                checkNumber(100);
                break;
            }

        }
    }

    public static void checkNumber(int limit) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int check;
        int attempts = 0;
        int randomNumber = random.nextInt(limit) + 1;
        do {
            System.out.printf("Wpisz liczbe i zobacz czy jest rowna: ");
            check = sc.nextInt();
            attempts++;
            if (check < randomNumber) {
                System.out.println("Twoja liczba jest wieksza");
            } else if (check > randomNumber) {
                System.out.println("Twoja liczba jest mniejsza");
            } else if (check == randomNumber) {
                System.out.println("Wygrales." + "\nLiczba prob: " + attempts);
            }
        } while (randomNumber != check);
    }
}
