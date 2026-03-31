package SOLID原則.Q5;

class PostgreSQLDatabase implements IDatabase {
    public void connect() { System.out.println("連接 PostgreSQL"); }
}
