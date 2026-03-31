package SOLID原則.電商應用;

public class Main {
    public static void main(String[] args) {
     ISubject subject = new PriceTracker( );
     IObserver obs  = new Shopper ("Mary") ; 
     subject.registerObserver( obs ) ;
     ((PriceTracker)subject).setPrice(25); 
	 //顯示 "Mary received update from PriceTracker. New Watermelon price:25"

     subject.removeObserver( obs ) ; 
  }
}