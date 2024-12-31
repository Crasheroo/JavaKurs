package Prace_Domowe.Cos_Tam_Bankowego;


public class Rachunek {
    private Osoba owner;
    private double amount;

    public Rachunek() {}

    public Rachunek(Osoba owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public Osoba getOwner() {
        return owner;
    }

    public void setOwner(Osoba owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    boolean wplata(double amount) {
        setAmount(getAmount() + amount);
        return true;
    }

    boolean wyplata(double amount) {
        if (this.amount >= amount) {
            setAmount(getAmount() - amount);
            return true;
        }
        return false;
    }

    boolean przelew(Rachunek rachunek, double amount) {
        if (this.amount >= amount) {
            System.out.println("Przelew udany!");
            this.amount -= amount;
            rachunek.amount += amount;
            return true;
        } else {
            System.out.println("Przelew nieudany!");
            return false;
        }
    }

    void aktualizacja() {
        System.out.println("Rachunek:");
        System.out.println("Wlasciciel: \n" + owner);
        System.out.println("Saldo: " + amount + " zł");
    }

    @Override
    public String toString() {
        return "Rachunek: " + owner
                + ", saldo: " + amount;
    }
}
