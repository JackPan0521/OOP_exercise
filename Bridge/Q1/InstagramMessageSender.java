package Bridge.Q1;

public class InstagramMessageSender implements MessageSender{
    public void sendMessage(String s){
        System.out.println("Sending Instagram message: "+s);
    }
}
