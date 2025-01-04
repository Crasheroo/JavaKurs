package Watki.MojeZadania.Zadanie3;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 11; i < 20; i++) {
            System.out.println(i);
        }
    }
}
