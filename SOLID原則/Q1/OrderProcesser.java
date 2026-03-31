package SOLID原則.Q1;

public class OrderProcesser implements IOrderProcesser {
    @Override
    public void processOrder() {
        System.out.println("處理訂單");
    }
}
