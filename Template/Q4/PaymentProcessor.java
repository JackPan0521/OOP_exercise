package Template.Q4;

public abstract class PaymentProcessor {
    public final void processPayment(){
        validatePaymentMethod();
        executePayment(); 
        sendNotification();
    } 

    abstract void validatePaymentMethod();
    abstract void executePayment();

    void sendNotification() {
        System.out.println("發送支付通知");
    }
}
