package Watki;

import static java.lang.Thread.sleep;

public class PingPong {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Watek("Ping"));
        Thread thread2 = new Thread(new Watek("Pong"));

        thread.start();
        sleep(500);
        thread2.start();
    }
}
