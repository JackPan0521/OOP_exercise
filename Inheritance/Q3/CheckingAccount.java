package Q3;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount + 10;
    }

    @Override
    public String toString(){
        return String.format("CheckingAccount %s balance: %.1f", accountNumber, balance);
    }
    
}
