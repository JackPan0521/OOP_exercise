package Bridge.Q1;

public abstract class Mobile implements MessageSender{
    protected MessageSender ms;

    abstract void display();
    public void sendMessage(String s){ms.sendMessage(s);}
}
