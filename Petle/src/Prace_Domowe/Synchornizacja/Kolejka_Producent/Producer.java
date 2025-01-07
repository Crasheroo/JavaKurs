package Prace_Domowe.Synchornizacja.Kolejka_Producent;
import java.util.Random;

public class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
//            int randomTime = random.nextInt(2000);
            try {
//                Thread.sleep(50);
                sharedResource.produce(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
