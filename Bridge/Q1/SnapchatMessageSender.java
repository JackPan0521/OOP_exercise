package Bridge.Q1;

public class SnapchatMessageSender implements MessageSender{
    public void sendMessage(String s){
        System.out.println("Sending Snapchat message: "+s);
    }
}
