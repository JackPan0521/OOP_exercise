設計一個寵物醫院，針對不同寵物種類計算收費。

1. 所有寵物有名稱與基本診療費。
2. 狗 (Dog)：依體重加收每公斤 10 元。
3. 貓 (Cat)：加收美容費 200 元。
4. 鳥 (Bird)：若為大型鳥（如鸚鵡），加收 500 元。
   類別設計
5. Pet：name, baseFee
6. Dog, Cat, Bird 各自覆寫 getFee()。

測試類別:
public class Main {
public static void main(String[] args) {
Pet p1 = new Dog("Buddy", 300, 12.5);
Pet p2 = new Cat("Kitty", 300);
Pet p3 = new Bird("Coco", 300, true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}

範例輸出：
Dog Buddy total fee: 425.0
Cat Kitty total fee: 500.0
Bird Coco total fee: 800.0
