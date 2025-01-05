package Watki.MojeZadania.Zadanie11;

public class Consumer implements Runnable {
    private final SharedClass sharedClass;

    public Consumer(SharedClass sharedClass) {
        this.sharedClass = sharedClass;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sharedClass.poll();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
