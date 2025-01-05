package Watki.MojeZadania.Zadanie9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timer implements Runnable {
    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            LocalTime local = LocalTime.now();
            System.out.println(local.format(formatter));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
