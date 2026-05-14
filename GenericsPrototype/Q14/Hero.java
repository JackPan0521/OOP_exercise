package GenericsPrototype.Q14;
import java.util.ArrayList;

public class Hero implements Cloneable{
    private String name;
    private ArrayList<String> skills;
    private static Hero prototype;

    private Hero(String name, ArrayList<String> skills){
        this.name = name;
        this.skills = skills;
    }

    public static Hero getPrototype(String name, ArrayList<String> skills){
        if(prototype == null)
            return prototype = new Hero(name, skills);
        return prototype;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addSkill(String skill){
        skills.add(skill);
    }

    public void show(){
        System.out.printf("%s skills=[",name);
        for (String s : skills) {
            System.out.print(s+", ");
        }
        System.out.println("]");
    }

    public Hero clone() throws CloneNotSupportedException{
        Hero res = (Hero)super.clone();
        res.skills = (ArrayList<String>) skills.clone();
        return res;
    }
}
