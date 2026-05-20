package GenericsPrototype.Q9;

public class Test {
    public static <T extends Comparable<T>> T max(T t1, T t2, T t3){
        T tmp = t1.compareTo(t2) >= 0 ? t1:t2;
        return tmp.compareTo(t3) >= 0 ? tmp:t3;
    }
    public static void main(String[] args) {
        System.out.println(max(3, 7, 5));  
        System.out.println(max("A", "Z", "M")); 
   }
}

