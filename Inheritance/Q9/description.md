外送系統中有多種商品，每個商品都有名稱與價格。

1. Meal：根據份量大小（small/medium/large）調整價格。
2. Drink：加珍珠加 10 元。
3. Dessert：若超過指定卡路里則折扣 10%。
   類別設計
4. Item：name, price
5. Meal, Drink, Dessert → 覆寫 getFinalPrice()。

測試類別:
public class Main {
public static void main(String[] args) {
Item i1 = new Meal("Beef Rice", 100, "large");
Item i2 = new Drink("Milk Tea", 60, true);
Item i3 = new Dessert("Cake", 80, 600);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

}

範例輸出：
Meal Beef Rice (large): 150.0
Drink Milk Tea (with pearl): 70.0
Dessert Cake: 72.0
