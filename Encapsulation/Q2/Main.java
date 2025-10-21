package Encapsulation.Q2;

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