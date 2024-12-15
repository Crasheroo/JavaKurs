package Kalkulator;

public class Dzielenie implements Dzialanie{
    @Override
    public double licz(double arg1, double arg2) {
        if (arg1 != 0) {
            return arg1 / arg2;
        } else {
            return 0;
        }
    }
}
