package Watki.MojeZadania.Zadanie5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();
        Thread thread = new Thread(new Thread1(shared));
        Thread thread2 = new Thread(new Thread1(shared));

        thread.start();
        thread.join();
        thread2.start();
    }
}
