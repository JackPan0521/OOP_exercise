設計一個角色系統，每個角色都有名稱、生命值（HP）、攻擊力（ATK）。
不同職業的角色繼承 Character 類別並改寫攻擊行為。
角色類型說明如下：

1. Warrior（戰士）：攻擊造成攻擊力 × 1.2 的傷害。
2. Mage（法師）：攻擊會消耗 10 點魔力 (MP)，造成攻擊力 × 1.5 的魔法傷害。若 MP 不足則無法攻擊。
3. Archer（弓箭手）：攻擊時有 50% 機率觸發「雙重射擊」，造成兩次傷害。

類別與建構子設計說明

1. Character 類別:
   屬性 型別 說明
   name String 角色名稱
   hp int 生命值（Health Points）
   atk int 攻擊力（Attack Power）

建構子：public Character(String name, int hp, int atk)

2. Warrior 類別
   建構子：public Warrior(String name, int hp, int atk)

3. Mage 類別
   屬性 型別 說明
   mp int 魔力值（Magic Points）
   建構子：public Mage(String name, int hp, int atk, int mp)
   PS: 攻擊時會消耗 10 點 MP；若不足則提示「MP 不足，無法施法」。
4. Archer 類別
   建構子：public Archer(String name, int hp, int atk)

測試類別:
public class Main {
public static void main(String[] args) {
Character w = new Warrior("Thor", 100, 20);
Character m = new Mage("Merlin", 80, 25, 30);
Character a = new Archer("Robin", 90, 18);

        w.attack(m);   // 戰士攻擊法師
        m.attack(a);   // 法師攻擊弓箭手
        a.attack(w);   // 弓箭手攻擊戰士
    }

}

範例輸出（隨機部分略有差異）：
Thor attacks Merlin for 24 damage. Merlin HP = 56
Merlin casts a spell on Robin for 37 damage. MP = 20, Robin HP = 53
Robin fires two arrows at Thor for 36 damage! Thor HP = 64
