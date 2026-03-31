package SOLID原則.Q4;

class Main {
   public static void main(String[] args) {        
   	Shape p = new Rectangle(5, 4);  
    System.out.println(p.getArea()); //回傳 20
    p = new Square(5);  
    System.out.println(p.getArea()); //回傳 25
  }
}
