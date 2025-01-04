package Watki.MojeZadania.Zadanie4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread parzysty = new Thread(new MyThreadParzysty());
        Thread nieParzysty = new Thread(new MyThreadNieparzysty());

        parzysty.start();
        parzysty.join();
        nieParzysty.start();
    }
}
