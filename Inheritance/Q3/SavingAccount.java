package Q3;

public class SavingAccount extends Account {

    public SavingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount * 1.01;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("SavingAccount %s balance: %.1f", accountNumber, balance);
    }
}
