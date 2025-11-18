package Q8;

class Student extends Person{
    protected String object;
    protected String id;
    
    public Student(String name, int age, String object, String id){
        super(name, age);
        this.object = object;
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Student %s (%s) ID: %s", name, object, id);
    }
}
