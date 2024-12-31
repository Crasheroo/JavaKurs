package Prace_Domowe.Taka_Duza.Products;

import java.util.Optional;

public class Book extends Product {
    private String author;

    public Book(String name, String category, double price, double rating, Optional<String> manufacturer, boolean inStock, String author) {
        super(name, category, price, rating, manufacturer, inStock);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", inStock=" + inStock +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
