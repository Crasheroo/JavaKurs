package Watki.MojeZadania.Zadanie2;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final Queue<Integer> queue;
    private final int capacity;

    public Buffer(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("pelne");
            wait();
        }
        queue.add(value);
        System.out.println("dodano: " + value);
        notifyAll();
    }

    public synchronized int pull() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("ppusty");
            wait();
        }

        int value = queue.poll();
        System.out.println("Pobrano: " + value);
        return value;
    }
}
