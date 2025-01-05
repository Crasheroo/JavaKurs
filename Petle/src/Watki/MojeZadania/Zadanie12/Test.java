package Watki.MojeZadania.Zadanie12;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Imie", "Nazwisko", 18));
        people.add(new Person("Imie2", "Nazwisko2", 20));
        people.add(new Person("Imie3", "Nazwisko3", 22));
        people.add(new Person("Imie4", "Nazwisko4", 24));

        Counter counter = new Counter(people);
        Thread thread = new Thread((Runnable) new ThreadCounter(counter, people));
        thread.start();
    }
}
