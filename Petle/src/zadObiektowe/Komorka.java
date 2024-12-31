package zadObiektowe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Komorka extends Telefon {
    protected List<String> lastCalls = new ArrayList<>();

    public Komorka(String interfejsKomunikacyjny, Color color) {
        super(interfejsKomunikacyjny, color);
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        System.out.println("lista ostatnio wybieranych numerów:");
        lastCalls.forEach(System.out::println);
    }

    @Override
    public void call(String num) {
        System.out.println("Dzwonie pod: " + num);
        lastCalls.add(num);
    }
}
