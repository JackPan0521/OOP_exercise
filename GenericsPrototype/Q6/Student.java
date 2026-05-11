package GenericsPrototype.Q6;

public class Student implements Cloneable{
    private String name,studentClass;
    private int grade;

    public Student(String name,String studentClass,int grade){
        this.name = name;
        this.studentClass = studentClass;
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("%s %s Grade=%d\r\n",name,studentClass,grade);
    }

    public Student cloneStudent() throws CloneNotSupportedException{
        return (Student) clone();
    }
}
