package Q3;

public class VIPAccount extends Account{

    public VIPAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        if(amount > 10_000){
            balance += amount * 1.02;
        }else{
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("VIPAccount %s balance: %.1f", accountNumber, balance);
    }
}
