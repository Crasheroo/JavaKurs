package Watki.MojeZadania.Zadanie2;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread threadProducer = new Thread(new Producer(buffer));
        Thread threadConsumer = new Thread(new Consumer(buffer));

        threadProducer.start();
        threadConsumer.start();
    }
}
