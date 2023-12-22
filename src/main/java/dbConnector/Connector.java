package dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    // Attribute
    private Connection connection = null;

    // Constructor
    public Connector() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_phan_thuong","root","");
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_phan_thuong","root","");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return conn;
        }
    }
}
