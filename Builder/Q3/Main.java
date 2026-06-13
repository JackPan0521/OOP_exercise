package Builder.Q3;

public class Main {
  public static void main(String[] args) {
    String sql = new SqlQueryBuilder()
        .select("name", "age")
        .from("students")
        .where("age >= 18")
        .orderBy("name ASC")
        .build();

    System.out.println(sql);
  }
}