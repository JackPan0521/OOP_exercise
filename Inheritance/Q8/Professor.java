package Q8;

class Professor extends Staff{
    protected double allowance;
    
    public Professor(String name, int age, String position, double salary, double allowance){
        super(name, age, position, salary);
        this.allowance = allowance;
    }

    @Override
    public String toString(){
        return String.format("Professor %s - %s, Total Pay: %.1f", name, position, salary + allowance);
    }
}
