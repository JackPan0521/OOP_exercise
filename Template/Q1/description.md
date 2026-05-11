設計一個 BeverageTemplate 抽象類別，包含 泡水、加主要原料 和 攪拌 三個步驟，讓子類別去實現不同的飲料類型，例如 Tea（茶） 和 Coffee（咖啡）。

請檢視程式碼介面是否違反 Template 模式，並撰寫報告，討論新設計有何優點?

修改成
public class Main {
public static void main(String[] args) {
Beverage tea = new Tea();
tea.prepareBeverage();

        System.out.println("———");

        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }

}
並修改使得執行輸出：
煮沸水
加茶葉
攪拌茶水
———
煮沸水
加咖啡粉
攪拌咖啡
