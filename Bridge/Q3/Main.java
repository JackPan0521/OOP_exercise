package Bridge.Q3;

public class Main {
    public static void main(String[] args) {
        Payment p = new MobilePayment(new CreditCardProcessor() );
        p.display(); //顯示我是行動支付
        p.processPayment(10000); //顯示 "Processing payment through  creditcard of 10000 "

        p = new OnlinePayment(new BankTransferProcessor() );
        p.display(); //顯示我是線上支付
        p.processPayment(10000); //顯示 "Processing payment through bank transfer of 10000 "
    }
}
