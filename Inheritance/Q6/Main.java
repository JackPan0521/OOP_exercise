package Q6;

public class Main {
public static void main(String[] args) {
Ticket t1 = new Ticket("A100", 300);
Ticket t2 = new StudentTicket("A200", 300);
Ticket t3 = new MorningTicket("A300", 300);
Ticket t4 = new VipTicket("A400", 300);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}