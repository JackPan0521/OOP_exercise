package Builder.Q5;

public class Main {
  public static void main(String[] args) {
    MealDirector director = new MealDirector();
    Meal meal = director.createStudentMeal(new Meal.Builder());
    System.out.println(meal);
  }
}