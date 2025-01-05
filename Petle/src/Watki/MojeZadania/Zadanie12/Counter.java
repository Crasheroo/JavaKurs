package Watki.MojeZadania.Zadanie12;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private final List<Person> people;

    public Counter(List<Person> people) {
        this.people = new ArrayList<>(people);
    }

    public synchronized int count(List<Person> people) {
        int count = people.size();
        System.out.println(count);
        return count;
    }
}
