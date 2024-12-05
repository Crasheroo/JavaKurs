package Zadanie_Cztery;

public class Kwadrat extends Figura{
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double pole() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
