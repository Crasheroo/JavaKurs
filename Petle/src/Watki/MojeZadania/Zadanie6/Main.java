package Watki.MojeZadania.Zadanie6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();
        Thread increment = new Thread(new ThreadIncrement(shared));
        Thread decrement = new Thread(new ThreadDecrement(shared));

        increment.start();
        increment.join();
        decrement.start();
    }
}
