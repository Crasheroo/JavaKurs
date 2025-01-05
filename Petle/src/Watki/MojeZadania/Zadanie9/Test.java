package Watki.MojeZadania.Zadanie9;

public class Test {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread thread = new Thread(new Timer());
        thread.start();
    }
}
