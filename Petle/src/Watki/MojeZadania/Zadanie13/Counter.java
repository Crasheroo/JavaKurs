package Watki.MojeZadania.Zadanie13;

public class Counter implements Runnable {
    private final SharedList sharedList;

    public Counter(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        while (true) {
            int count = sharedList.getPeopleCount();
            System.out.println("Aktualna liczba osob: " + count);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
