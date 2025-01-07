package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] consumerCount = {3, 5, 10 ,15};

        for (int count : consumerCount) {
            System.out.println("Test z " + count + " zjadaczami");
            countTime(count);
            System.out.println();
        }
    }

    private static void countTime(int consumerCount) throws InterruptedException {
        SharedResource sr = new SharedResource();

        Thread producer = new Thread(new Producer(sr));

        Thread[] consumers = new Thread[consumerCount];
        for (int i = 0; i < consumerCount; i++) {
            consumers[i] = new Thread(new Consumer(sr));
        }

        long startTime = System.nanoTime();

        producer.start();
        for (Thread consumer : consumers) {
            consumer.start();
        }

        producer.join();
        for (Thread consumer : consumers) {
            consumer.join();
        }

        long endTime = System.nanoTime();
        long time = (endTime - startTime) / 1_000_000;

        System.out.println("Czas: " + time + "ms");
    }
}
