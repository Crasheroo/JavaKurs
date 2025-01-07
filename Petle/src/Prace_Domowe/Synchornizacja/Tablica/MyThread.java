package Prace_Domowe.Synchornizacja.Tablica;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {
    private int[] tablica;
    private int start;
    private int end;
    private AtomicInteger suma;

    public MyThread(int[] tablica, int start, int end, AtomicInteger suma) {
        this.tablica = tablica;
        this.start = start;
        this.end = end;
        this.suma = suma;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += tablica[i];
        }
        suma.addAndGet(sum);
    }
}
