package Template.Q3;

public abstract class DocumentProcessor {
    public void execute(){
        readFile();
        processData();
        saveFile();
    }

    abstract void readFile();
    abstract void processData();
    abstract void saveFile();
}
