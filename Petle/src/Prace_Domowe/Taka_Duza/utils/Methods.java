package Prace_Domowe.Taka_Duza.utils;

import Prace_Domowe.Taka_Duza.model.Product;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Methods extends FunctionalInterfaces {
    @Override
    public Predicate<Product> isAvailableAndCheap() {
        return product -> product.isInStock() && product.getPrice() < 2000;
    }

    @Override
    public Predicate<Product> isElectronics() {
        return product -> "Electronics".equalsIgnoreCase(product.getCategory());
    }

    @Override
    public Function<Product, String> productToString() {
//        Product product = new Product();
//        return "Product: " + product.getName() + ", Price: " + product.getPrice();
        return null;
    }

    @Override
    public Consumer<String> printString() {
        return System.out::println;
    }
}
