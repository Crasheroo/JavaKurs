package Watki.MojeZadania.Zadanie8;

public class Wyplata implements Runnable{
    private final BankAccount bankAcc;

    public Wyplata(BankAccount bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public void run() {
        int value = 1;
        while (value <= 100) {
            try {
                bankAcc.wyplata(value);
                value++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
