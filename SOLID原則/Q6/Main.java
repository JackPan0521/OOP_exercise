package SOLID原則.Q6;

class Main {
   public static void main(String[] args) {
    PaymentMethod p = new CreditCardPayment(); 
    p.pay(); //顯示"信用卡付款"

    p = new PayPalPayment(); 
    p.pay(); //顯示"PayPal付款"
    }
}