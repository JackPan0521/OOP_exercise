請檢視程式碼介面是否違反 Abstract Factory 模式，並撰寫報告，討論新設計有何優點?

重新撰寫ChairClient類別
public class ChairClient {
private Chair chair;

    public ChairClient(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void useChair() {
        chair.sitOn();
    }

}
並修改程式，使得執行輸出：
1.ChairClient os = new ChairClient(new OfficeChairFactory() );
os.useChair();
2.ChairClient os = new ChairClient(new GamingChairFactory() );
os.useChair();

輸出:
Sitting on Office Chair
Sitting on Gaming Chair
