package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sr = new SharedResource();

        Thread producer = new Thread(new Producer(sr));
        Thread consumer1 = new Thread(new Consumer(sr));
        Thread consumer2 = new Thread(new Consumer(sr));
        Thread consumer3 = new Thread(new Consumer(sr));

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
