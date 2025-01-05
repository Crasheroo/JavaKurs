package Watki.MojeZadania.Zadanie11;

import java.util.LinkedList;
import java.util.Queue;

public class SharedClass {
    private final Queue<Integer> queue;
    private int maxSize = 0;

    public SharedClass() {
        this.queue = new LinkedList<>();
    }

    public synchronized void add(int newValue) throws InterruptedException {
        while (!queue.isEmpty()) {
            System.out.println("Kolejka jest pelna");
            wait();
        }
        System.out.println("Dodano wartosc: " + newValue);
        queue.add(newValue);
        notifyAll();
    }

    public synchronized void poll() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Kolejka jest pusta");
            wait();
        }
        int value = queue.poll();
        System.out.println("Usunieto wartosc: " + value);
        notifyAll();
    }
}
