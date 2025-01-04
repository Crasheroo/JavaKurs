package Watki.MojeZadania.Zadanie5;

public class Shared {
    private int value = 0;

    public synchronized int add() {
        value++;
        System.out.println(value);
        return value;
    }
}
