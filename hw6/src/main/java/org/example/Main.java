package org.example;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final String URL = "jdbc:h2:~/test";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws SQLException {

        String depid = "2 OR 1=1";
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

                PreparedStatement preparedStatement1 = connection.prepareStatement("""
                        SELECT * FROM employees where department_id = ?
                        """);

//                PreparedStatement preparedStatement2 = connection.prepareStatement("""
//                        SELECT DEPARTMENT_NAME FROM DEPARTMENTS
//                        JOIN LOCATIONS ON DEPARTMENTS.LOCATION_ID = LOCATIONS.LOCATION_ID
//                        WHERE COUNTRY_ID = 'US';
//                        """);
        ) {
//            connection.createStatement().execute("INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES (200,'Mamad','Mamadi','mamad@email.org','1234',DATE '1995-05-20',13,3100.00,114,3);")
//            connection.createStatement().execute("update countries set country_name = 'iran' where country_name = 'Argentina'");
            System.out.println("connected tp db successfully");

            preparedStatement1.setString(1, depid);
            try (ResultSet resultSet = preparedStatement1.executeQuery()) {
                while (resultSet.next()) {
                    String dn = resultSet.getString("department_id");
                    String ln = resultSet.getString("last_name");
                    System.out.println(dn + " " + ln);
                }
            }
        }
    }
}