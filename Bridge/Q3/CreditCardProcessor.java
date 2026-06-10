package Bridge.Q3;

public class CreditCardProcessor implements PaymentHandler{
    public void processPayment(int num){
        System.out.println("Processing payment through  creditcard of "+num);
    }
}
