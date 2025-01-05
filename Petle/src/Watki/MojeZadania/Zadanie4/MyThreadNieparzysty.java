package Watki.MojeZadania.Zadanie4;

public class MyThreadNieparzysty implements Runnable{
    @Override
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
