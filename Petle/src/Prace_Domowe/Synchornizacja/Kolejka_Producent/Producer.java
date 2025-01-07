package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class Producer implements Runnable {
    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5000; i++) {
                sharedResource.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            sharedResource.finish();
        }
    }
}
