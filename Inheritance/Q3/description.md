設計一個銀行帳戶系統。所有帳戶都有帳號與餘額。

1. 儲蓄帳戶 (SavingAccount)：存款時有利息 1%。
2. 支票帳戶 (CheckingAccount)：提款時會收取手續費 10 元。
3. VIP 帳戶 (VIPAccount)：存款多於 10,000 元時享有 2% 利息。
   類別設計
   Account：accountNumber, balance, deposit(double), withdraw(double)
   SavingAccount, CheckingAccount, VIPAccount：覆寫存/提款邏輯。

測試類別:
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

輸出：
SavingAccount S001 balance: 2020.0
CheckingAccount C001 balance: 1490.0
VIPAccount V001 balance: 23300.0
