請設計一個 銀行帳戶管理系統，可以完成以下功能：
1 建立多個帳戶（包含姓名、帳號、餘額）。
2 將帳戶加入銀行（Bank）。
3 查詢並列出所有帳戶資訊。
4 對特定帳戶存款與提款，並查看更新後的資訊。

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
      System.out.println(account.getAccountInfo());}

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

輸出：
姓名: Alice, 帳號: A001, 餘額: 1000.0
姓名: Bob, 帳號: B002, 餘額: 2000.0
姓名: Charlie, 帳號: C003, 餘額: 3000.0
=== 存款操作 ===
姓名: Alice, 帳號: A001, 餘額: 1500.0
=== 查詢帳戶資訊 (Bob) ===
姓名: Bob, 帳號: B002, 餘額: 2000.0
=== 提款操作 ===
姓名: Charlie, 帳號: C003, 餘額: 2000.0
提示： 1. 物件組合 (Object Composition): Bank 類別內含 ArrayList → 一個銀行管理多個帳戶。
2. 集合操作: 使用 ArrayList 儲存與遍歷多個帳戶。