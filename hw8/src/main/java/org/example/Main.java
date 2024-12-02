package org.example;

import java.sql.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws SQLException {

        String read = """
                SELECT * FROM employees
                """;
        String insert = """
                                insert into employees (EMPLOYEE_ID ,FIRST_NAME ,LAST_NAME ,EMAIL ,PHONE_NUMBER , SALARY, job_id, hire_date ) 
                values (?, ?, ?, ?, ?, ?, 3, CURRENT_DATE)
                """;

        try (
                PreparedStatement preparedStatementRead = ConnectionManager.getConnection().prepareStatement(read);
        ) {

            logger.info("connected tp db successfully");

            try (ResultSet resultSet = preparedStatementRead.executeQuery()) {
                while (resultSet.next()) {
                    String fn = resultSet.getString("FIRST_NAME");
                    String ln = resultSet.getString("LAST_NAME");
                    String email = resultSet.getString("EMAIL");
                    String phoneNumber = resultSet.getString("PHONE_NUMBER");
                    String salary = resultSet.getString("SALARY");
                    System.out.println(fn + " " + ln + " " + email + " " + phoneNumber + " " + salary);
                }
            }
        }

        try (
                PreparedStatement preparedStatementInsert = ConnectionManager.getConnection().prepareStatement(insert);
        ) {

            logger.info("connected tp db successfully");

            try (ResultSet resultSet = preparedStatementInsert.executeQuery()) {
                while (resultSet.next()) {
                    preparedStatementInsert.setString(1, resultSet.getString("EMPLOYEE_ID"));
                    preparedStatementInsert.setString(2, resultSet.getString("FIRST_NAME"));
                    preparedStatementInsert.setString(3, resultSet.getString("LAST_NAME"));
                    preparedStatementInsert.setString(4, resultSet.getString("EMAIL"));
                    preparedStatementInsert.setString(5, resultSet.getString("PHONE_NUMBER"));
                    preparedStatementInsert.setString(6, resultSet.getString("SALARY"));
                    preparedStatementInsert.execute();
                }
            }
        }
    }

}
