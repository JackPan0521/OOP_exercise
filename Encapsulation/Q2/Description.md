請設計一個 Dog 類別，包含 名字 (name) 與 品種 (breed) 兩個屬性，並提供建構子、getter 與 setter 方法。
在 Main 類別中，建立兩隻狗，印出牠們的名字與品種，接著修改一隻狗的品種與另一隻狗的名字，再次輸出修改後的結果。

public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Buddy", "Golden Retriever");
    Dog dog2 = new Dog("Max", "Bulldog");

    System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
    System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

    System.out.println("After updating...");

    dog1.setBreed("Labrador");
    dog2.setName("Charlie");

    System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
    System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
  }
}


輸出：
Buddy is a Golden Retriever.
Max is a Bulldog.
After updating...
Buddy is a Labrador.
Charlie is a Bulldog.


提示：
封裝 (Encapsulation):
1 使用 private 保護屬性 (name、breed)，避免外部直接修改。
2 透過 getter 與 setter 控制存取與修改。