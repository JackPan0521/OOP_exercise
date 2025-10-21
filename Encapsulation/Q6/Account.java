package Encapsulation.Q6;

public class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public Account(String name, String number, double initialBalance){
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public String getAccountInfo(){
        return "姓名: " + accountHolder + ", 帳號: " + accountNumber + ", 餘額: " + balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}
