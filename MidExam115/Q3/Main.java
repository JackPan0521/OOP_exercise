package MidExam115.Q3;

public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(1);

        Connection conn1 = pool.borrowConnection();
        conn1.connect();

        pool.returnConnection(conn1);

        pool.returnConnection(conn1);

    }
}
