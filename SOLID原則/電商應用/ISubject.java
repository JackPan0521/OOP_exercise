package SOLID原則.電商應用;

interface ISubject {
    void registerObserver(IObserver obs);
    void removeObserver(IObserver obs);
    void setPrice(int price);
}
