package hw4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionHolder {

    private static final Logger log = Logger.getLogger(ConnectionHolder.class.getName());

    private static Connection connection;

    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            } catch (SQLException e) {
                log.log(Level.SEVERE, "Connect error", e);
                throw new RuntimeException(e);
            }
        }

        return connection;
    }
}
