package Template.Q1;

abstract class Beveragee {
    public void prepareBeverage() {
        addMainIngredient();
        boilWater();  // 錯誤：應該先煮水再加主要原料
        stir();
    }

    abstract void addMainIngredient();
    abstract void stir();
    abstract void boilWater();
}