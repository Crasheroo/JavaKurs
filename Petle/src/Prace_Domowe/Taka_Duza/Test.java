package Prace_Domowe.Taka_Duza;

import Prace_Domowe.Taka_Duza.Interfaces.FunctionalInterfaces;
import Prace_Domowe.Taka_Duza.Interfaces.Methods;
import Prace_Domowe.Taka_Duza.Products.Appliance;
import Prace_Domowe.Taka_Duza.Products.Book;
import Prace_Domowe.Taka_Duza.Products.Electronics;
import Prace_Domowe.Taka_Duza.Products.Product;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        FunctionalInterfaces funInt = new Methods();
        List<Product> products = ProductData.getProducts();
        ProductService ps = new ProductService();

//        ps.filterProducts(products, funInt.isAvailableAndCheap())
//                .forEach(System.out::println);
//        ps.filterProducts(products, funInt.isAvailableAndCheap().and(funInt.isElectronics()))
//                .forEach(System.out::println);

//        System.out.println(ps.findBestRatedProducts(products, "Electronics"));

//        System.out.println(ps.calculateAvaragePrice(products, "Electronics"));

//        System.out.println(ps.groupProductsByCategory(products));
    }

    public class ProductData {
        public static List<Product> getProducts() {
            return Arrays.asList(
                    // Elektronika
                    new Electronics("Laptop Lenovo", "Electronics", 3000.00, 4.5, true, Optional.of("Lenovo"), 24),
                    new Electronics("Smartphone Samsung", "Electronics", 1500.00, 4.2, true, Optional.of("Samsung"), 12),
                    new Electronics("Smartphone Xiaomi", "Electronics", 999.99, 4.0, false, Optional.empty(), 12),
                    new Electronics("Telewizor Sony", "Electronics", 4000.00, 4.7, true, Optional.of("Sony"), 36),
                    new Electronics("Laptop Dell", "Electronics", 2800.00, 4.4, true, Optional.of("Dell"), 24),


                    // AGD
                    new Appliance("Suszarka do włosów Philips", "Appliance", 200.00, 4.1, Optional.of("Philips"), true, "A++"),
                    new Appliance("Mikser Bosch", "Appliance", 250.00, 4.3, Optional.of("Bosch"), true, "A+"),
                    new Appliance("Odkurzacz Dyson", "Appliance", 1200.00, 4.6, Optional.of("Dyson"), false, "A++"),

                    // Książki
                    new Book("Książka Java 11", "Book", 89.99, 4.8, Optional.empty(), true, "John Doe"),
                    new Book("Książka Algorytmy", "Book", 120.00, 4.5, Optional.empty(), false, "Jane Smith")
            );
        }
    }
}


