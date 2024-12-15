package Kalkulator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Siema, co chcesz zrobic?");
        String dzialanie = sc.nextLine();

        System.out.println("Podaj pierwsza liczbe");
        double arg1 = sc.nextDouble();

        System.out.println("Podaj druga liczbe");
        double arg2 = sc.nextDouble();

        double result = calc.calculate(arg1, arg2, dzialanie);
        System.out.println("Wynik operacji na zajebistym kalkulatorze: " + result);

    }
}
