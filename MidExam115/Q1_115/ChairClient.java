package MidExam115.Q1_115;

public class ChairClient {
    private Chair chair;

    public ChairClient(ChairFactory factory) {
        this.chair = factory.createChair();
    }

    public void useChair() {
        chair.sitOn();
    }
}
