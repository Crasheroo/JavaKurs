package Watki.MojeZadania.Zadanie3;

import Watki.MojeZadania.Zadanie3.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread2());

        thread.start();
        thread.join();
        thread2.start();
    }
}
