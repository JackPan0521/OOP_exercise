package SOLID原則.Q5;

class MySQLDatabase implements IDatabase {
    public void connect() { System.out.println("連接 MySQL"); }
}