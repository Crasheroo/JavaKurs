package Watki.MojeZadania.Zadanie11;

public class Producer implements Runnable {
    private final SharedClass sharedClass;
    private int limit;

    public Producer(SharedClass sharedClass, int limit) {
        this.sharedClass = sharedClass;
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            try {
                sharedClass.add(i);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
