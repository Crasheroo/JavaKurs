package Prace_Domowe.Cos_Tam_Bankowego;


import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Konto> accounts = AccountData.getAccounts();
        Rachunek rachunek = new Rachunek();
        Konto konto = accounts.get(1);

        Konto konto1 = accounts.get(2);
        konto.aktualizacja();
    }

    public static class AccountData {
        public static List<Konto> getAccounts() {
            return Arrays.asList(
                    new Konto(new Osoba("Paulincia", "Zalewska"), 10_000, 0.2),
                    new Konto(new Osoba("Jakub", "Cwelman"), 20_000, 0.2),
                    new Konto(new Osoba("Hubert", "Pypka"), 5_000, 0.2),
                    new Konto(new Osoba("Marcin", "Ciamajda"), 8_000, 0.2),
                    new Konto(new Osoba("Karol", "Wojtyla"), 1_000, 0.2)
            );
        }
    }
}
