package Q8;

class Staff extends Person{
    protected String position;
    protected double salary;

    public Staff(String name, int age, String position, double salary){
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("Staff %s - %s, Salary: %.1f", name, position, salary);
    }
}
