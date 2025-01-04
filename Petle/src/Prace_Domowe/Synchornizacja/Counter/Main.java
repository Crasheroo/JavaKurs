package Prace_Domowe.Synchornizacja.Counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new MyThread(counter));
        Thread thread2 = new Thread(new MyThread(counter));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getCount());
    }
}
