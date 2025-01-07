package Prace_Domowe.Synchornizacja.Kolejka_Producent;

public class Consumer implements Runnable {
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedResource.consume();
                if (sharedResource.isFinished() && !sharedResource.hasValue) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
