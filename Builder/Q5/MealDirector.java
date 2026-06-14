package Builder.Q5;

public class MealDirector {
    public Meal createStudentMeal(Meal.Builder builder){
        return builder.main("Burger").drink("Tea").dessert("Cookie").build();
    }
}
