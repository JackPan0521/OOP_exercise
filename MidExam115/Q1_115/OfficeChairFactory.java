package MidExam115.Q1_115;

public class OfficeChairFactory implements ChairFactory{
    public Chair createChair(){
        OfficeChair officeChair = new OfficeChair();
        return officeChair;
    }
}
