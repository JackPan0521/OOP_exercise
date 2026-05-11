package Template.Q1;

abstract class Beverage {
    public void prepareBeverage() {
        boilWater();
        addMainIngredient();
        stir();
    }

    abstract void addMainIngredient();
    abstract void stir();
    abstract void boilWater();
}