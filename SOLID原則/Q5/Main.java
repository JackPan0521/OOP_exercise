package SOLID原則.Q5;

class Main {
    public static void main(String[] args) {        
        IDatabase database = new MySQLDatabase(); 
        Application app = new Application(database);
         app.start(); //顯示"連接 MySQL"

        database = new PostgreSQLDatabase(); 
        app = new Application(database);
        app.start(); //顯示"連接 PostgreSQL"
    }
}