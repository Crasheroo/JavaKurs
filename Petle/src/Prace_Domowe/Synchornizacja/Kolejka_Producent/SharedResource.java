package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class SharedResource {
    int value = 0;
    boolean hasValue = false;

    public void produce(int newValue) throws InterruptedException {
        synchronized (this) {
            while (hasValue) {
                wait();
            }
            value = newValue;
            hasValue = true;
            System.out.println("Producent dodał: " + newValue);
            notifyAll();
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasValue) {
            wait();
        }
        hasValue = false;
        System.out.println("Konsument pobrał: " + value);
        notifyAll();
    }
}
