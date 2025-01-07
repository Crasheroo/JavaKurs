package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class SharedResource {
    private int value = 0;
    public boolean hasValue = false;
    private boolean isFinished = false;

    public synchronized void produce(int newValue) throws InterruptedException {
        while (hasValue) {
            wait();
        }
        value = newValue;
        hasValue = true;
//        System.out.println("Producent dodał: " + newValue);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasValue && !isFinished) {
            wait();
        }
        if (hasValue) {
            hasValue = false;
//            System.out.println("Konsument pobrał: " + value);
            notifyAll();
        }
    }

    public synchronized void finish() {
        isFinished = true;
        notifyAll();
    }

    public synchronized boolean isFinished() {
        return isFinished;
    }
}
