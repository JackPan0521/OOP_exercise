package Template.Q4;

public class PayPalPayment extends PaymentProcessor {
    public void validatePaymentMethod(){
        System.out.println("驗證PayPal帳戶");
    }
    public void executePayment(){
        System.out.println("執行PayPal支付");
    }
}
