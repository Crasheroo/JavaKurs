package Watki;

import static java.lang.Thread.sleep;

public class Watek implements Runnable {
    private String akcja;

    public Watek(String akcja) {
        this.akcja = akcja;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(akcja);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
