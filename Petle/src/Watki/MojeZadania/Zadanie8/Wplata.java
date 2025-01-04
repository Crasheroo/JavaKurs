package Watki.MojeZadania.Zadanie8;

public class Wplata implements Runnable{
    private final BankAccount bankAcc;

    public Wplata(BankAccount bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public void run() {
        int value = 1;
        while (value <= 100) {
            bankAcc.wplata(value);
            value++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
