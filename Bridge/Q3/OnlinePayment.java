package Bridge.Q3;

public class OnlinePayment extends Payment{
    public OnlinePayment(PaymentHandler ph){this.ph = ph;}
    public void display(){System.out.println("我是線上支付");}
}
