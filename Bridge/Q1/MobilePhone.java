package Bridge.Q1;

public class MobilePhone extends Mobile{
    public MobilePhone(MessageSender ms){
        this.ms = ms;
    }
    public void display(){
        System.out.println("我是手機");
    }
}
