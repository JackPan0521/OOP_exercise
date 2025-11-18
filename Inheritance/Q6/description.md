設計一個影城訂票系統，所有票都有編號與基本價格。
不同電影票有不同的優惠規則：

1. 一般票 (NormalTicket)：原價。
2. 學生票 (StudentTicket)：打 8 折。
3. 早場票 (MorningTicket)：打 7 折。
4. 貴賓票 (VipTicket)：原價 + 免費飲料費 50 元。
   類別設計
   Ticket：id, price，getPrice()
   StudentTicket, MorningTicket, VipTicket → 覆寫 getPrice()。

測試類別:
public class Main {
public static void main(String[] args) {
Ticket t1 = new Ticket("A100", 300);
Ticket t2 = new StudentTicket("A200", 300);
Ticket t3 = new MorningTicket("A300", 300);
Ticket t4 = new VipTicket("A400", 300);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}

範例輸出：
Normal Ticket A100: 300.0
Student Ticket A200: 240.0
Morning Ticket A300: 210.0
VIP Ticket A400: 350.0
