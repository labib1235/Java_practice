package com.company;

import java.sql.*;
import java.util.Scanner;

public class class_19 {
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

            String sqlInsert = "insert into persons_info(name, age, address) values('"+ name +"', "+ age +", '"+ address +"')";

            statement.executeUpdate(sqlInsert);

            con.close();

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
