package Template.Q4;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPayment();
        creditCard.processPayment();

        System.out.println("———");

        PaymentProcessor paypal = new PayPalPayment();
        paypal.processPayment();
    }
}