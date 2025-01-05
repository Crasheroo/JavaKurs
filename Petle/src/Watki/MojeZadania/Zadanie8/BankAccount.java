package Watki.MojeZadania.Zadanie8;

public class BankAccount {
    int balance = 500;

    public synchronized void wplata(int value) {
        balance += value;
        System.out.println("Wplacono: " + value + ", Saldo wynosi: " + balance);
        notifyAll();
    }

    public synchronized void wyplata(int value) throws InterruptedException {
        while (balance < value) {
            System.out.println("Nie ma srodkow na koncie");
            wait();
        }
        balance -= value;
        System.out.println("Wyplacono: " + value + ", Saldo wynosi: " + balance);
        notifyAll();
    }
}
