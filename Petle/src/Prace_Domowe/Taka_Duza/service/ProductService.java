package Prace_Domowe.Taka_Duza.service;

import Prace_Domowe.Taka_Duza.model.Book;
import Prace_Domowe.Taka_Duza.model.Electronics;
import Prace_Domowe.Taka_Duza.model.Product;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService<R> {

    List<Product> filterProducts(List<Product> products, Predicate<Product> predicate) {
        return products.stream()
                .filter(predicate)
                .toList();
    }

    List<R> mapProducts(List<Product> products, Function<Product, R> mapper) {
        return products.stream()
                .map(mapper)
                .toList();
    }

    void forEachCompany(List<R> data, Consumer<R> consumer) {
        data.forEach(consumer);

    }

    Optional<Product> findBestRatedProducts(List<Product> products, String category) {
        return products.stream()
                .filter(p -> p.getCategory().equals(category))
                .max(Comparator.comparingDouble(Product::getRating));
    }

    OptionalDouble calculateAvaragePrice(List<Product> products, String category) {
        return products.stream()
                .filter(p -> p.getCategory().equals(category))
                .map(p -> p.getPrice())
                .mapToDouble(price -> price)
                .average();
    }

    Map<String, List<Product>> groupProductsByCategory(List<Product> products) {
        if (products == null) {
            return Collections.emptyMap();
        }

        return products.stream()
                .filter(p -> p != null)
                .collect(Collectors.groupingBy(c -> c.getCategory()));
    }

    Map<String, Long[]> countProductsWithAndWithoutManufacturer(List<Product> products) {
        if (products == null) {
            return Collections.emptyMap();
        }

        long withManufacturer = products.stream()
                .filter(p -> p != null && p.getManufacturer().isPresent())
                .count();

        long withoutManufacturer = products.stream()
                .filter(p -> p != null && p.getManufacturer().isEmpty())
                .count();

        Map<String, Long[]> result = new HashMap<>();
        result.put("Oblicz", new Long[]{withManufacturer, withoutManufacturer});
        return result;
    }

    List<Electronics> getElectronicsWithWarranty(List<Product> products, int minWarranty) {
        return products.stream()
                .filter(product -> product instanceof Electronics)
                .map(product -> (Electronics) product)
                .filter(p -> p.getWarrantyPeriod() == minWarranty)
                .toList();
    }

    List<Book> getBooksByAuthor(List<Product> products, String author) {
        return products.stream()
                .filter(product -> product instanceof Book)
                .map(product -> (Book) product)
                .filter(p -> p.getAuthor().equals(author))
                .toList();
    }
}

