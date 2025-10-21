package Encapsulation.Q6;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public void depositMoney(Account account, double amount){
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount){
        account.withdraw(amount);
    }
}
