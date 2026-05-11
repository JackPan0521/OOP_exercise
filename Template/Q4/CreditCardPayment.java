package Template.Q4;

public class CreditCardPayment extends PaymentProcessor{
    public void validatePaymentMethod(){
        System.out.println("驗證信用卡");
    }
    public void executePayment(){
        System.out.println("執行信用卡支付");
    }
}
