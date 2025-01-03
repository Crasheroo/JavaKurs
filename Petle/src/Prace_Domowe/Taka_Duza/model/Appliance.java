package Prace_Domowe.Taka_Duza.model;

import java.util.Optional;

public class Appliance extends Product {
    private String energyClass;

    public Appliance(String name, String category, double price, double rating, Optional<String> manufacturer, boolean inStock, String energyClass) {
        super(name, category, price, rating, manufacturer, inStock);
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "energyClass='" + energyClass + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", inStock=" + inStock +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
