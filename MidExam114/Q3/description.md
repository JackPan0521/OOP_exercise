某系統需要一個「全域設定管理器」(ConfigManager)，在程式運行過程中只能存在一份，並且在第一次被使用時才初始化。
請設計一個類別，利用建構子與 getInstance() 方法確保該類別只能建立唯一實例。：

public class ConfigTest {
public static void main(String[] args) {
ConfigManager c1 = ConfigManager.getInstance();
ConfigManager c2 = ConfigManager.getInstance();

        System.out.println("c1 hashCode=" + c1.hashCode());
        System.out.println("c2 hashCode=" + c2.hashCode());
        System.out.println("Same instance? " + (c1 == c2));
    }

}

輸出：
Loading configurations...
c1 hashCode=12345678
c2 hashCode=12345678
Same instance? true
