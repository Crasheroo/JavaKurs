package Watki.MojeZadania.Zadanie11;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        SharedClass sharedClass = new SharedClass();
        Thread producer = new Thread(new Producer(sharedClass, 5));
        Thread consumer = new Thread(new Consumer(sharedClass));

        producer.start();
        consumer.start();
    }
}
