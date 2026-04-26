package MidExam115.Q2;

public class Main {
    public static void main(String[] args) {
        ModernInventoryApp p = new ModernInventoryApp(new LegacyInventorySystemAdapter( ) );
        p.updateStock("筆電" , 5 );
    }
}
