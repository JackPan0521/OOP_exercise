package Bridge.Q1;

public class MobileNotepad extends Mobile {
    public MobileNotepad(MessageSender ms){
        this.ms = ms;
    }
    public void display(){System.out.println("我是平板電腦");}
}
