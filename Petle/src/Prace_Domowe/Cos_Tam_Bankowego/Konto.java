package Prace_Domowe.Cos_Tam_Bankowego;


public class Konto extends Rachunek {
    static double OPROCENTOWANIE;

    public Konto(Osoba owner, double amount, double oprocentowanie) {
        super(owner, amount);
        OPROCENTOWANIE = oprocentowanie;
    }

   static void zmienOprocentowanie(double procent) {

   }


}
