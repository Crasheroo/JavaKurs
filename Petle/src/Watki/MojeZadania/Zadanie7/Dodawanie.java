package Watki.MojeZadania.Zadanie7;

public class Dodawanie implements Runnable {
    private final SharedBuffor sharedBuffor;

    public Dodawanie(SharedBuffor sharedBuffor) {
        this.sharedBuffor = sharedBuffor;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                sharedBuffor.add(value++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

