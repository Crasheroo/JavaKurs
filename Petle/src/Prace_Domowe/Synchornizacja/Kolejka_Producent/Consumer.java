package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class Consumer implements Runnable{
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                sharedResource.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
