package MidExam115.Q1_115;

public class GamingChairFactory implements ChairFactory{
    public Chair createChair(){
        GamingChair gamingChair = new GamingChair();
        return gamingChair;
    }
}
