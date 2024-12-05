package Zadanie_Cztery;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Figura> listaFigur = new ArrayList<>();

        listaFigur.add(new Kolo(1.5));
        listaFigur.add(new Kwadrat(21.37));

        for (Figura figura : listaFigur) {
            System.out.println(figura.pole());
        }
    }
}
