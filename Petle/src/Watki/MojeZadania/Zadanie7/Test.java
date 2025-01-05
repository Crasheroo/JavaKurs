package Watki.MojeZadania.Zadanie7;

import Kalkulator.Odejmowanie;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffor sharedBuffor = new SharedBuffor(5);

        Thread dodawanie = new Thread(new Dodawanie(sharedBuffor));
        Thread odejmowanie = new Thread(new Usuwanie(sharedBuffor));

        dodawanie.start();
        odejmowanie.start();
    }
}
