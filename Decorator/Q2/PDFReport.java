package Decorator.Q2;

public class PDFReport implements Report{
    private Report report;
    public PDFReport(Report report){this.report = report;}
    public String getContent(){return "PDF["+report.getContent()+"]";}
}
