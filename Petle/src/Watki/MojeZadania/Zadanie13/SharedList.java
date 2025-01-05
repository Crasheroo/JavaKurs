package Watki.MojeZadania.Zadanie13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SharedList {
    private final List<Person> people;

    public SharedList() {
        this.people = Collections.synchronizedList(new ArrayList<>());
    }

    public void addPerson(Person person) {
        synchronized (people) {
            people.add(person);
            System.out.println("Dodano osobe: " + person);
        }
    }

    public int getPeopleCount() {
        synchronized (people) {
            return people.size();
        }
    }
}
