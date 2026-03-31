package SOLID原則.Q3;

public class Main {
    public static void main(String[] args) {
	Worker robot = new Robot();
	robot.work();

	Human human = new Human();
	human.work();
	human.eat();
    }

}