package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection conn;

    private DBConnection() {
        // prevent object creation
    }

    public static Connection getConnection() {
        try {
            if (conn == null) {

                // Load MySQL driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create connection
                conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/college_event",
    "root",
    "gayu$priya2026#"
);

                System.out.println("Database Connected Successfully!");
            }

        } catch (Exception e) {
            System.out.println("DB Connection Failed ❌");
            e.printStackTrace();
        }

        return conn;
    }

    // Optional: test connection directly
    public static void main(String[] args) {
        getConnection();
    }
}