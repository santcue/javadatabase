package cue.edu.co.Singleton;
import java.sql.*;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String user = "root";
    private static String password = "root123";
    private static Connection connection;
    public static Connection getConnection() throws SQLException{
        if(connection==null) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}