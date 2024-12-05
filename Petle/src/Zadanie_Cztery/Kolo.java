package Zadanie_Cztery;

public class Kolo extends Figura{
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "r=" + r +
                '}';
    }
}
