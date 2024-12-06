package org.example;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:h2:~/test";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws Sql {

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

                PreparedStatement p1 = connection.prepareStatement("""
                        SELECT * FROM employees where department_id = ?
                        """);

                PreparedStatement p2 = connection.prepareStatement("""
                        SELECT DEPARTMENT_NAME FROM DEPARTMENTS
                        JOIN LOCATIONS ON DEPARTMENTS.LOCATION_ID = LOCATIONS.LOCATION_ID
                        WHERE COUNTRY_ID = 'US';
                        """);
        ) {
            connection.createStatement().execute("update countries set country_name = 'iran' where country_name = 'Argentina'");
            System.out.println("connected tp db successfully");

            try (ResultSet resultSet = p1.executeQuery()) {
                while (resultSet.next()) {
                    String name = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phone_number");
                    System.out.println(name + " " + lastName + " " + email + " " + phoneNumber);
                }
            }
        } catch (SQLException e) {
            throw new Sql("", e);
        }
    }
}