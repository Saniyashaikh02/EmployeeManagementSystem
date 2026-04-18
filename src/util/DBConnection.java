package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

private static final String URL = "jdbc:mysql://localhost:3306/ems_db";
private static final String USER = "testuser";   // <-- NOT root
private static final String PASSWORD = "1234";   // or test@1234

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}