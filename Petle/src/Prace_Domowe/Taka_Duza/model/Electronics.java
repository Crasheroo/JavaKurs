package Prace_Domowe.Taka_Duza.model;

import java.util.Optional;

public class Electronics extends Product {
    private int warrantyPeriod; // w miesiacach

    public Electronics(String name, String category, double price, double rating, boolean inStock, Optional<String> manufacturer, int warrantyPeriod) {
        super(name, category, price, rating, manufacturer, inStock);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warrantyPeriod=" + warrantyPeriod +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", inStock=" + inStock +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
