package Watki.MojeZadania.Zadanie13;

public class Test {
    public static void main(String[] args) {
        SharedList sharedList = new SharedList();

        Thread producerThread = new Thread(new Producer(sharedList));
        Thread consumerThread = new Thread(new Counter(sharedList));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
