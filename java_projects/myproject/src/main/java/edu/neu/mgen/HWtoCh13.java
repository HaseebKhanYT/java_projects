package edu.neu.mgen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HWtoCh13 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "admin123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(connection.nativeSQL(
                    "SELECT * FROM users"));
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String dateOfBirth = resultSet.getString("date_of_birth");

                System.out.println("User ID: " + userId);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Date of Birth: " + dateOfBirth);
                System.out.println("------------------------");
            }
            connection.close();

        } catch (

        Exception e) {
            System.out.println(e);
        }

    }
}