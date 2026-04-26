package MidExam115.Q1_115;

public class Main {
    public static void main(String[] args) {
        ChairClient os = new ChairClient(new OfficeChairFactory() );
        os.useChair();
        os = new ChairClient(new GamingChairFactory() );
        os.useChair();  
    }
}
