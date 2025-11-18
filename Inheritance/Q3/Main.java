package Q3;

public class Main {
public static void main(String[] args) {
Account a1 = new SavingAccount("S001", 1000);
Account a2 = new CheckingAccount("C001", 2000);
Account a3 = new VIPAccount("V001", 8000);

        a1.deposit(1000);
        a2.withdraw(500);
        a3.deposit(15000);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

}
