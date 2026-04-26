package MidExam115.Q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConnectionPool {
    private List<Connection> pool;
    private Set<Connection> borrowed;

    public ConnectionPool(int size) {
        pool = new ArrayList<>();
        borrowed = new HashSet<>();
        for (int i = 0; i < size; i++) {
            pool.add(new Connection());
        }
    }

    public Connection borrowConnection() {
        if (pool.isEmpty()) {
            System.out.println("No available connections.");
            return null;
        }
        Connection conn = pool.remove(pool.size() - 1);
        borrowed.add(conn);
        return conn;
    }

    public void returnConnection(Connection conn) {
        if (!borrowed.contains(conn)) {
            System.out.println("Warning: This connection was not borrowed from the pool.");
            return;
        }
        borrowed.remove(conn);
        pool.add(conn);
    }
}
