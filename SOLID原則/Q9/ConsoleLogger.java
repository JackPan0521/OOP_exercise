package SOLID原則.Q9;

class ConsoleLogger implements Loggable {
   public void log(String log){
        System.out.println("Log: "+log);
    }
}
