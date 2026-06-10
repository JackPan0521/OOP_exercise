package Bridge.Q3;

public abstract class Payment implements PaymentHandler{
    protected PaymentHandler ph;
    public abstract void display();
    public void processPayment(int num){
        ph.processPayment(num);
    }
}
