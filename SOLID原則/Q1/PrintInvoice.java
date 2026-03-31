package SOLID原則.Q1;

public class PrintInvoice implements IPrintInvoice {

    @Override
    public void printInvoice() {
        System.out.println("列印發票");
    }    
}
