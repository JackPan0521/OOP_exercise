package SOLID原則.Q1;

class Main {
     public static void main(String[] args) {
        Order od = new Order();
        od.processOrder(new OrderProcesser());
        od.printInvoice(new PrintInvoice());
        od.sendEmailConfirmation(new SendEmailConfirmation());
    }
}
