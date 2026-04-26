package Quiz2.Question1;

public class Sorter {
public static void main(String[] args) {
    TaxCalculator p = new TaxCalculator( );
    p.setTaxStrategy( new USATax() ) ; 
    System.out.println( p.calculateTax(1000) );  //回傳 100 

    p = new TaxCalculator( );
    p.setTaxStrategy( new UKTax() ) ; 
    System.out.println( p.calculateTax(1000) );  //回傳 200 


    p = new TaxCalculator( );
    p.setTaxStrategy( new CanadaTax() ) ; 
    System.out.println( p.calculateTax(1000) );  //回傳 150 
    }
}