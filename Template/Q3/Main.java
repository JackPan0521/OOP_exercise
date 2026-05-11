package Template.Q3;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor csv = new CSVProcessor();
        csv.execute();

        System.out.println("———");

        DocumentProcessor json = new JSONProcessor();
        json.execute();
    }
}
