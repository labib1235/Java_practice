package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonInfoRepository {
    public List<PersonInfo> getAllPerson() {
        List<PersonInfo> personInfoList = new ArrayList<>();

        String sql = "select id as p_id, name as p_name, age as p_age, address as p_address";
        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");
                String email = resultSet.getString("p_email");


                PersonInfo personInfo = new PersonInfo(id, name, age, address, email);

                personInfoList.add(personInfo);
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return personInfoList;
    }

    public PersonInfo getPersonById(Integer id) {
        PersonInfo personInfo = null;
        String sql = "select id as p_id, name as p_name, age as p_age, address as p_address, email as p_email from person_info where id=" + id + "";
        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                int pid = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");
                String email = resultSet.getString("p_email");

                personInfo = new PersonInfo(pid, name, age, address, email);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return personInfo;
    }

    public PersonInfo getPersonInfoByName(String name) {
        PersonInfo personInfo = null;

        String sql = "select name as p_name, id as p_id, age as p_age, address as p_address, email as p_email from person_info where name = '" + name + "'";
        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                int pid = resultSet.getInt("p_id");
                String pname = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");
                String email = resultSet.getString("p_email");


                personInfo = new PersonInfo(pid, pname, age, address, email);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return personInfo;
    }

    public void savePersonInfo(PersonInfo info) {
        String name = info.getName();
        int age = info.getAge();
        String address = info.getAddress();
        String email = info.getEmail();


        String sqlInsert = "insert into person_info(name, age, address, email) values ('" + name + "', " + age + ", '" + address + "', '" + email + "')";

        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            statement.executeUpdate(sqlInsert);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePersonInfo(PersonInfo info) {
        Integer id = info.getId();
        String name = info.getName();
        int age = info.getAge();
        String address = info.getAddress();
        String email = info.getEmail();

        String sqlInsert = "update person_info set name = '" + name + "', age = " + age + ", address = '" + address + "', email = '" + email + "' where id = " + id ;

        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            statement.executeUpdate(sqlInsert);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePersonInfoById(Integer id) {
        String sqlDelete = "delete from person_info where id = " + id +"";

        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            statement.executeUpdate(sqlDelete);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
