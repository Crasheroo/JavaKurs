import java.util.Scanner;

public class Zadanie_Jeden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String option = "y";

        while (option.equals("y")) {
            System.out.println("Podaj pierwsza liczbe: ");
            double firstNumber = sc.nextDouble();

            System.out.println("Podaj druga liczbe: ");
            double secondNumber = sc.nextDouble();

            System.out.println("Jakie dzialanie chcesz zrobic? +, -, *, /, %, ^.");
            String operator = sc.next();

            double result = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "/" -> {
                    if (secondNumber == 0) {
                        System.out.println("Nie dzieli sie przez 0 :)");
                        yield Double.NaN;
                    } else {
                        yield firstNumber / secondNumber;
                    }
                }
                case "%" -> firstNumber % secondNumber;
                case "^" -> Math.pow(firstNumber, secondNumber);
                default -> {
                    System.out.println("Podano zly operator");
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                System.out.println("Wynik: " + result);
            }

            System.out.println("Czy chcesz wykonać kolejne działanie? (y/n)");
            option = sc.next().toLowerCase();

            if (option.equals("n")) {
                System.out.println(result % 2 == 0 ? "Wynik jest parzysty" : "Wynik jest nieparzysty");
            }

        }
    }
}
