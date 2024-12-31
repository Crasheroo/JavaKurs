package Prace_Domowe.Statki;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        char[][] plansza = new char[5][5];
        boolean[][] statki = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                plansza[i][j] = '~';
            }
        }

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x, y;

            do  {
                x = random.nextInt(5);
                y = random.nextInt(5);
            } while (statki[x][y]);

            statki[x][y] = true;
        }

        Scanner sc = new Scanner(System.in);
        int trafienia = 0;

        while (trafienia < 3) {
            for (char[] row : plansza) {
                System.out.println(row);
            }

            int x = checkInput(sc, "wiersz");
            int y = checkInput(sc, "kolumne");

            if (plansza[x][y] != '~') {
                System.out.println("Bylo strzelane");
            }

            if (statki[x][y]) {
                System.out.println("Trafiony es");
                plansza[x][y] = 'X';
                trafienia++;
            } else {
                System.out.println("Debil");
                plansza[x][y] = 'o';
            }
        }

        System.out.println("Wygrana es");
        sc.close();
    }

    public static int checkInput(Scanner sc, String type) {
        int value = -1;
        while (value < 0 || value >= 5) {
            System.out.printf("Podaj %s (0 - 4):%n", type);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
            } else {
                sc.next();
                System.out.println("Podaj poprawna liczbe\n");
            }
        }
        return value;
    }
}
