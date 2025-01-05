package Prace_Domowe.Synchornizacja.Tablica;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        int[] tablica = new int[1000];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1;
        }

        AtomicInteger suma = new AtomicInteger(0);
        int wielkosc = tablica.length / 4;

        Thread[] threads = new Thread[4];

        for (int i = 0; i < 4; i++) {
            int start = i + wielkosc;
            int end = (i == 3) ? tablica.length : start + wielkosc;

            threads[i] = new Thread(new MyThread(tablica, start, end, suma));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Suma: " + suma.get());
    }
}
