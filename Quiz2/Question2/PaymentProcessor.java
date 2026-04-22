public class PaymentProcessor {
	private final NewPaymentProcessor processor;

	public PaymentProcessor(NewPaymentProcessor processor) {
		this.processor = processor;
	}

	public void pay(int amount) {
		processor.processPayment(amount);
	}
}
