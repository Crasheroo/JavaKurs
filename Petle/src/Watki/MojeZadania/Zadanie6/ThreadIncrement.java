package Watki.MojeZadania.Zadanie6;

public class ThreadIncrement implements Runnable{
    private final Shared shared;

    public ThreadIncrement(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            shared.increment();

        }
    }
}
