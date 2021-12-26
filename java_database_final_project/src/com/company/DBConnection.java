package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static final String URL = "jdbc:mysql://localhost/labib?serverTimezone=UTC";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection con = null;

        try {
           con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
