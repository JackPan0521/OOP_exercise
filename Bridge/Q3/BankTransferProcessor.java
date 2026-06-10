package Bridge.Q3;

public class BankTransferProcessor implements PaymentHandler{
    public void processPayment(int num){
        System.out.println("Processing payment through bank transfer of "+num);
    }
}
