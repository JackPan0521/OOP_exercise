package Encapsulation.Q6;

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank();

    Account account1 = new Account("Alice", "A001", 1000);
    Account account2 = new Account("Bob", "B002", 2000);
    Account account3 = new Account("Charlie", "C003", 3000);

    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);

    // 印出所有帳戶
    for (Account account : bank.getAccounts()) {
      System.out.println(account.getAccountInfo());
    }

    System.out.println("=== 存款操作 ===");
    bank.depositMoney(account1, 500);
    System.out.println(account1.getAccountInfo());

    System.out.println("=== 查詢帳戶資訊 (Bob) ===");
    System.out.println(account2.getAccountInfo());

    System.out.println("=== 提款操作 ===");
    bank.withdrawMoney(account3, 1000);
    System.out.println(account3.getAccountInfo());
  }
}