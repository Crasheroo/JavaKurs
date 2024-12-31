package Prace_Domowe.Choinka;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        int wysokosc = sc.nextInt();

        for (int i = 0; i <= wysokosc; i++) {
            for (int j = 0; j <= wysokosc - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i <= wysokosc / 3; i++) {
            for (int j = 0; j < wysokosc; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        sc.close();
    }
}
