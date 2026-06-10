package Decorator.Q2;

public class HTMLReport implements Report{
    private Report report;
    public HTMLReport(Report report){this.report = report;}
    public String getContent(){return "HTML["+report.getContent()+"]";}
}
