package Prace_Domowe.ListaMiast;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        List<Integer> citiesPopulation = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.print("Wprowadz miasto: ");
            String city = sc.nextLine();
            cities.add(city);

            boolean valid = false;
            do {
                try {
                    System.out.print("Wprowadz populacje miasta " + city + ": ");
                    int population = sc.nextInt();
                    citiesPopulation.add(population);
                    sc.nextLine();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.err.println("Podaj liczbe debilu");
                    sc.nextLine();
                }
            } while (!valid);

            System.out.println();
            System.out.println("Czy chcesz dodac nastepne miasto?");
            System.out.println("1 - Kontunuacja");
            System.out.println("0 - Wyjscie");
            option = sc.nextInt();
            sc.nextLine();
        } while (option != 0);

        Map<String, Integer> citiesWithPopulation = new HashMap<>();

        for (int i = 0; i < cities.size(); i++) {
            citiesWithPopulation.put(cities.get(i), citiesPopulation.get(i));
        }

        citiesWithPopulation.forEach(
                (c, p) -> System.out.println("Miasto: " + c + ", ma populacje: " + p)
        );

        sc.close();
    }
}
