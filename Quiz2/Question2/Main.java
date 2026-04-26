package Quiz2.Question2;

public class Main {
    public static void main(String[] args) {        
        PaymentProcessor p = new PaymentProcessor(new OldPaymentAdapter(new OldPaymentSystem()));
        p.pay(1000); // 顯示 "Payment of 1000.0 made using old system"
    }
}