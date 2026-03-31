package SOLID原則.氣象應用;

interface ISubject {
    void registerObserver(IObserver o);   // 訂閱
    void removeObserver(IObserver o);    // 取消訂閱
    void notifyObservers();              // 通知所有已訂閱的 Observer
}
