學校有三種人員：

1. 學生 (Student)：有學號、科系。
2. 教職員 (Staff)：有職稱、月薪。
3. 教授 (Professor)：繼承自 Staff，增加研究津貼屬性。
   類別設計
4. Person：name, age
5. Student, Staff, Professor → 各自增加專屬屬性。

測試類別:
public class Main {
public static void main(String[] args) {
Person s = new Student("Alice", 20, "CS", "S12345");
Person st = new Staff("Bob", 35, "Administrator", 50000);
Person p = new Professor("Carol", 45, "Professor", 80000, 20000);

        System.out.println(s);
        System.out.println(st);
        System.out.println(p);
    }

}

範例輸出：
Student Alice (CS) ID: S12345
Staff Bob - Administrator, Salary: 50000.0
Professor Carol - Professor, Total Pay: 100000.0
