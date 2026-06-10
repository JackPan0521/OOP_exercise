package Bridge.Q3;

public class MobilePayment extends Payment{
    public MobilePayment(PaymentHandler ph){this.ph = ph;}
    public void display(){System.out.println("我是行動支付");}
}
