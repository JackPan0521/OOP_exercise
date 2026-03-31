package SOLID原則.Q9;

public class Main {
    public static void main(String[] args) {        
        Loggable p = new ConsoleLogger(); 
        p.log("message") ;//顯示 "Log:  message " 

        Notifiable email = new EmailNotifierV2(); 
        email.sendNotification("message") ;//顯示 "發送郵件:  message " 
     }

}
