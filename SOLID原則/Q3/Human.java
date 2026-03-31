package SOLID原則.Q3;

class Human implements Worker, Eatable {
    public void work() { System.out.println("人類工作"); }
    public void eat() {  System.out.println("人類吃飯"); }
}