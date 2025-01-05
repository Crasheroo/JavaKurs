package Watki.MojeZadania.Zadanie12;

import java.util.List;

public class ThreadCounter implements Runnable {
    private final Counter counter;
    private List<Person> people;

    public ThreadCounter(Counter counter, List<Person> people) {
        this.counter = counter;
        this.people = people;
    }

    @Override
    public void run() {
        counter.count(people);
    }
}
