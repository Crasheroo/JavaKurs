package Watki.MojeZadania.Zadanie6;

public class ThreadDecrement implements Runnable{
    private final Shared shared;

    public ThreadDecrement(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            shared.decrement();

        }
    }
}
