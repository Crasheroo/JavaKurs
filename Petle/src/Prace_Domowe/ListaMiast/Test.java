package Prace_Domowe.ListaMiast;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<City> cities = new ArrayList<>();
        int option;

        do {
            System.out.print("Podaj nazwe miasta: ");
            String cityName = sc.nextLine();

            System.out.print("Podaj populacje miasta " + cityName + ": ");
            int population = sc.nextInt();
            sc.nextLine();

            cities.add(add(cityName, population));

            System.out.println();
            System.out.println("Czy chcesz dodac nastepne miasto?");
            System.out.println("1 - Kontunuacja");
            System.out.println("0 - Wyjscie");
            option = sc.nextInt();
            sc.nextLine();
        } while (option != 0);

        Map<String, Integer> collect = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .collect(Collectors.toMap(c -> c.getCityName(), s -> s.getPopulation()));

        System.out.println(collect);
    }

    private static City add(String cityName, int population) {
        City city = new City(cityName, population);
        return city;
    }
}
