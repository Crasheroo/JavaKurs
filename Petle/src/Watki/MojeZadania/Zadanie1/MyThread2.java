package Watki.MojeZadania.Zadanie1;

import static java.lang.Thread.sleep;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                System.out.println("Pracuje...");
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
