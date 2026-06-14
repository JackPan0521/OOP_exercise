package Builder.Q5;

public class Meal {
    private String main,drink,dessert;
    private Meal(Builder builder){
        this.dessert = builder.dessert;
        this.drink = builder.drink;
        this.main = builder.main;
    }

    public String toString(){
        return String.format("Meal(main=%s, drink=%s, dessert=%s)",main,drink,dessert);
    }

    public static class Builder{
        private String main,drink,dessert;

        public Builder main(String main){
            this.main=main;
            return this;
        }

        public Builder drink(String drink){
            this.drink=drink;
            return this;
        }

        public Builder dessert(String dessert){
            this.dessert=dessert;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }
    }
}
