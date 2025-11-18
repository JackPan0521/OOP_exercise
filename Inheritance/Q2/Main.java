package Q2;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Novel("The Lost World", "Crichton", 500, true);
        Book b2 = new Textbook("Java Programming", "Horstmann", 800, 3);
        Book b3 = new Comic("One Piece", "Oda", 300, 220);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}