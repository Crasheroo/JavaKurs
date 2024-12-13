package Kalkulator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Dzialanie> dzialania = new HashMap<>();

    public Calculator() {
        dzialania.put("+", new Dodawanie());
        dzialania.put("-", new Odejmowanie());
        dzialania.put("*", new Mnozenie());
        dzialania.put("/", new Dzielenie());
    }

    public double calculate(double arg1, double arg2, String dzialanie) {
        return dzialania.get(dzialanie).licz(arg1, arg2);
    }
}
