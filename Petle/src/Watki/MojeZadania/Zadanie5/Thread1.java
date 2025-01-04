package Watki.MojeZadania.Zadanie5;

public class Thread1 implements Runnable{
    private final Shared shared;

    public Thread1(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            shared.add();
        }
    }
}
