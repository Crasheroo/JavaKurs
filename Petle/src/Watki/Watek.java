package Watki;

import static java.lang.Thread.sleep;

public class Watek implements Runnable {
    private String jebniecie;

    public Watek(String jebniecie) {
        this.jebniecie = jebniecie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(jebniecie);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
