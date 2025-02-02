package com.example.util;

import java.sql.*;

public class DBUtil {
    // Update with your MySQL connection info
    private static final String URL = "jdbc:mysql://localhost:3306/employee_leave_db";
    private static final String USER = "root";
    private static final String PASS = "Thisispto@14";

    static {
        try {
            // Load MySQL JDBC Driver (for MySQL 8+ use com.mysql.cj.jdbc.Driver)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
