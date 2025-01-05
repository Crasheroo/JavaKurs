package Watki.MojeZadania.Zadanie8;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

        Thread wplata = new Thread(new Wplata(bankAccount));
        Thread wyplata = new Thread(new Wyplata(bankAccount));

        wplata.start();
        wyplata.start();
    }
}
