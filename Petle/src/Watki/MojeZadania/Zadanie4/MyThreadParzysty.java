package Watki.MojeZadania.Zadanie4;

public class MyThreadParzysty implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
