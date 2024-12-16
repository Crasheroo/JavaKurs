package zadObiektowe;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Smartfon extends Komorka {
    protected List<Osoba> znajomi;

    public Smartfon(String interfejsKomunikacyjny, Color color, List znajomi) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = znajomi;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        System.out.println("lista znajomych do których ostatnio dzwoniliśmy:");

        lastCalls.forEach(this::formatowanie);
    }

    private void formatowanie (String num) {
        Optional<Osoba> person = znajomi.stream()
                .filter(c -> c.getNumer().equals(num)) //Stream<Osoba>
                .findAny();

        person.ifPresentOrElse(
                c -> System.out.println(c.getImie() + " " + c.getNazwisko() + " " + c.getNumer()),
                () -> System.out.println(num)
        );
    }
}
