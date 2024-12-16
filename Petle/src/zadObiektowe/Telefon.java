package zadObiektowe;

import java.awt.*;

public class Telefon {
    protected String interfejsKomunikacyjny;
    protected Color color;

    public Telefon(String interfejsKomunikacyjny, Color color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void call(String num) {
        System.out.println("Dzwonie pod: " + num);
    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("brak historii");
    }
}

