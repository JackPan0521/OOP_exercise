package Q3;

public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return String.format("Account %s balance: %.1f",accountNumber ,balance);
    }
}
