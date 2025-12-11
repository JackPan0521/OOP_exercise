設計 Product 類別實作 Comparable 介面，
依「價格高 → 低」排序；若價格相同，比較「名稱字母順序」。

測試類別:

import java.util.\*;

public class Main {
public static void main(String[] args) {
List list = Arrays.asList(
new Product("Keyboard", 1000),
new Product("Mouse", 600),
new Product("Monitor", 1000)
);

        Collections.sort(list);
        list.forEach(System.out::println);
    }

}

輸出:

Monitor : 1000
Keyboard : 1000
Mouse : 600
