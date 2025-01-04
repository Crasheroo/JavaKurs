package Watki.MojeZadania.Zadanie2;

public class Producer implements Runnable{
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                buffer.add(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
