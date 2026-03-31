package SOLID原則.Q5;

class Application {
    private IDatabase database;

    public Application(IDatabase database){
        this.database = database;
    }
    public void start() { database.connect(); }
}