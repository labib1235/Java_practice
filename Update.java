package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Class_19_2nd {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost/labib?serverTimezone=UTC";
        String USER_NAME = "root";
        String PASSWORD = "";

        try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = con.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("Input person name: ");
            String name = sc.nextLine();
            System.out.println("Input person age: ");
            int age = sc.nextInt();
            System.out.println("Input person address: ");
            sc.nextLine();
            String address = sc.nextLine();

            String sqlUpdate = "update persons_info set name = '"+ name +"', age = "+ age +", address = '"+ address +"' where id = 1";

            statement.executeUpdate(sqlUpdate);

            con.close();
        }

        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
