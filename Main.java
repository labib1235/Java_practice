package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost/labib?serverTimezone=UTC";
        String USER_NAME = "root";
        String PASSWORD = "";

        try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            String sql = "select name as p_name, id as p_id, age as p_age, address as p_address from person_info";

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()) {
                int id = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");

                System.out.println("id: " + id + " name: " + name + " age: " + age + " address: " + address);

            }

        con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
