package Watki;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Watek("ping"));
        Thread thread2 = new Thread(new Watek("pong"));

        thread.start();
        sleep(500);
        thread2.start();
    }
}
