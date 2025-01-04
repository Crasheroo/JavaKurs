package Watki.MojeZadania.Zadanie7;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffor {
    private final Queue<Integer> buffor;
    private final int capacity;

    public SharedBuffor(int capacity) {
        this.buffor = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int value) throws InterruptedException {
        while (buffor.size() == capacity) {
            System.out.println("Pelen bufor");
            wait();
        }

        buffor.add(value);
        System.out.println("dodano: " + value);
        notifyAll();
    }

    public synchronized int poll() throws InterruptedException {
        while (buffor.isEmpty()) {
            System.out.println("bufor jest pusty");
            wait();
        }
        int value = buffor.poll();
        System.out.println("usunieteo: " + value);
        return value;
    }
}
