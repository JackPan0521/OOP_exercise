package Quiz2.Question2;

public class OldPaymentAdapter implements NewPaymentProcessor {
    private final OldPaymentSystem oldPaymentSystem;

    public OldPaymentAdapter() {
        this(new OldPaymentSystem());
    }

    public OldPaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }   

    @Override
    public void processPayment(int amount) {
        oldPaymentSystem.makePayment(amount);
    }
}
