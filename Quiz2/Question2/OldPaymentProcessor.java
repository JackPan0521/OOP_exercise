package Quiz2.Question2;

public class OldPaymentProcessor {
    private final OldPaymentSystem oldPaymentSystem;

    public OldPaymentProcessor(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    public void processPayment(int amount) {
        oldPaymentSystem.makePayment(amount);
    }
}
