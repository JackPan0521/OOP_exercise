package SOLID原則.Q9;

class EmailNotifierV2 implements Loggable, Notifiable{
    public void log(String log){
        System.out.println("Log: "+log);
    }
    public void sendNotification(String message){
        System.out.println("發送郵件： "+message);
    }
}
