package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class SharedResource {
    int value = 0;
    boolean hasValue = false;

    public synchronized void produce(int newValue) throws InterruptedException {
        while (hasValue) {
            wait();
        }
        hasValue = true;
        value = newValue;
        System.out.println("Producent dodał: " + newValue);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasValue) {
            wait();
        }
        hasValue = false;
        System.out.println("Konsument pobrał: " + value);
        notifyAll();
        return value;
    }
}
