package Watki.MojeZadania.Zadanie6;

public class Shared {
    private int value = 0;

    public synchronized int increment() {
        value++;
        System.out.println(value);
        return value;
    }

    public synchronized int decrement() {
        value--;
        System.out.println(value);
        return value;
    }
}
