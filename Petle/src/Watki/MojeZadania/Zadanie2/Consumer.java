package Watki.MojeZadania.Zadanie2;

public class Consumer implements Runnable{
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        while (true) {
            try {
                buffer.pull();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
