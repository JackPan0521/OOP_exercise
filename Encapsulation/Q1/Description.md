設計一個 Circle 類別，透過建構子 (constructor) 建立圓物件，並提供：
1 半徑 radius 的 getter 與 setter 方法。
2 getArea() 方法：回傳圓面積。
3 getCircumference() 方法：回傳圓周長。
4 在 Main 類別 中，建立一個 Circle 物件，先輸入初始半徑，印出半徑、面積與周長，接著修改半徑，再次印出相關資訊。

public class Main {
  public static void main(String[] args) {
    int r = 5 ;
    Circle circle = new Circle(r);
    System.out.println( "半徑 = " + r);
    System.out.println( "面積 = " + circle.getArea());
    System.out.println( "周長 = " + circle.getCircumference());
    r = 10 ;
    circle.setRadius(r);
    System.out.println( "修改後半徑 = " + r);
    System.out.println( "修改後面積 = " + circle.getArea());
    System.out.println( "修改後周長 = " + circle.getCircumference());
  }
}

輸出：
半徑 = 5
面積 = 78.53981633974483
周長 = 31.41592653589793
修改後半徑 = 10
修改後面積 = 314.1592653589793
修改後周長 = 62.83185307179586

提示： 物件狀態變化:
1. 物件建立後仍能透過 setter 修改其屬性。
2. 測試程式示範了「先建立 → 輸出 → 修改 → 再輸出」的流程。