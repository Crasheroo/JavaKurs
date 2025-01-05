package Prace_Domowe.Synchornizacja.Counter;

public class Counter {
    private int count = 0;

    synchronized public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}