package Decorator.Q2;

public class ReportTest {
    public static void main(String[] args) {
        Report report = new HTMLReport(new PDFReport(new BasicReport()));

        System.out.println("Content: " + report.getContent());
    }
}
