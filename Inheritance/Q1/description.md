設計一個動物園餵食系統。
基本類別 Animal 具有屬性 name 和方法 eat()。
衍生類別 Herbivore（草食動物）與 Carnivore（肉食動物）分別覆寫 eat()，
ZooKeeper 餵食動物時，需依照動物的類別印出不同訊息。
類別結構
Animal: name、eat()
Herbivore: eat() → 顯示吃草
Carnivore: eat() → 顯示吃肉
ZooKeeper: 方法 feed(Animal a)。

測試類別:
public class Main {
public static void main(String[] args) {
Animal a1 = new Herbivore("Elephant");
Animal a2 = new Carnivore("Lion");

        ZooKeeper keeper = new ZooKeeper("John");
        keeper.feed(a1);
        keeper.feed(a2);
    }

}

輸出：
John is feeding Elephant. Elephant is eating plants.
John is feeding Lion. Lion is eating meat.
