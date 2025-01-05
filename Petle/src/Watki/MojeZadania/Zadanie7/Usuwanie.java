package Watki.MojeZadania.Zadanie7;

public class Usuwanie implements Runnable{
    private final SharedBuffor sharedBuffor;

    public Usuwanie(SharedBuffor sharedBuffor) {
        this.sharedBuffor = sharedBuffor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sharedBuffor.poll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
