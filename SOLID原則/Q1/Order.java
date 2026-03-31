package SOLID原則.Q1;

class Order {
    public void processOrder(IOrderProcesser orderProcesser) {
        orderProcesser.processOrder();
    }
    public void printInvoice(IPrintInvoice printInvoice) {
        printInvoice.printInvoice();
    }
    public void sendEmailConfirmation(ISendEmailConfirmation sendEmailConfirmation) {
        sendEmailConfirmation.sendEmailConfirmation();
    }
}