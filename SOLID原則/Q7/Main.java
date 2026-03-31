package SOLID原則.Q7;

public class Main {
    public static void main(String[] args) {        
        Report p = new PDFReport();
        p.generate(); //顯示"產生 PDF 報告"
        p = new WordReport(); 
        p.generate(); //顯示"產生 Word 報告"  
    }
}