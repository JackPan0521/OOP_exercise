package Bridge.Q1;

public class Main {
    public static void main(String[] args) {        
        Mobile p = new MobileNotepad(new InstagramMessageSender() );
   		p.display(); //顯示我是平板電腦
   		p.sendMessage("Hello"); //顯示 "Sending Instagram message: Hello "
   		p = new MobilePhone(new SnapchatMessageSender() );

   		p.display(); //顯示我是手機
   		p.sendMessage("Hello"); //顯示 "Sending Snapchat message: Hello "
    }
}