package zadObiektowe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Osoba> znajomi = List.of(
                new Osoba("Jan", "Kowalski", "123-456-789"),
                new Osoba("Anna", "Nowak", "987-654-321"),
                new Osoba("Piotr", "Wiśniewski", "555-666-777")
        );

        Telefon[] telefony = {
                new Telefon("Analogowy", Color.BLACK),
                new Komorka("GSM", Color.BLUE),
                new Smartfon("LTE", Color.RED, znajomi)
        };

        String[] numery = {
                "123-456-789", "111-222-333", "987-654-321", "444-555-666", "555-666-777",
                "777-888-999", "123-456-789", "222-333-444", "987-654-321", "666-777-888"
        };

        for (Telefon telefon : telefony) {
            for (int i = 0; i < 10; i++) {
                telefon.call(numery[i]);
            }
        }

        for (Telefon telefon : telefony) {
            telefon.wyswietlHistoriePolaczen();
            System.out.println();
        }
    }
}
