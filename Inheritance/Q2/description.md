設計一個線上書店系統，包含多種書籍類型。所有書籍都有書名、作者、價格。

1. 小說(Novel) 會根據是否為暢銷書打 9 折；
2. 教科書(Textbook) 根據版本(edition) 給予固定折扣，例如第 1 版不打折，第 2 版打 95 折，第 3 版打 9 折；
3. 漫畫(Comic) 根據頁數(pageCount) 超過 200 頁給予 85 折。
   類別設計說明
   Book：書名、作者、價格，getPrice() 回傳實際售價（子類可覆寫）。
   Novel：新增屬性 boolean bestseller。
   Textbook：新增屬性 int edition。
   Comic：新增屬性 int pageCount。

測試類別:
public class Main {
public static void main(String[] args) {
Book b1 = new Novel("The Lost World", "Crichton", 500, true);
Book b2 = new Textbook("Java Programming", "Horstmann", 800, 3);
Book b3 = new Comic("One Piece", "Oda", 300, 220);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}

輸出：
Novel: The Lost World (Crichton) - Price: 450.0
Textbook: Java Programming (Horstmann) - Price: 720.0
Comic: One Piece (Oda) - Price: 255.0
