package SOLID原則.電商應用;

import java.util.ArrayList;
import java.util.List;

class PriceTracker implements ISubject{
    private List<IObserver> shopperList = new ArrayList<>();
    private int price;

    @Override
    public void setPrice(int price){
        this.price = price;
        notifyObservers();
    }
    
    @Override
    public void removeObserver(IObserver obs){
        shopperList.remove(obs);
    }
    
    @Override
    public void registerObserver(IObserver obs){
        shopperList.add(obs);
    }

    private void notifyObservers(){
        for (IObserver o : shopperList) {
            o.update(price);
        }
    }
}
