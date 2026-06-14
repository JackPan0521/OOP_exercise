package Builder.Q4;

public class Main {
  public static void main(String[] args) {
    Computer c = new Computer.Builder()
        .cpu("i7")
        .ramGB(16)
        .ssdGB(512)
        .gpu("RTX4060")
        .build();

    System.out.println(c);
    System.out.println("Total=" + c.price());
  }
}