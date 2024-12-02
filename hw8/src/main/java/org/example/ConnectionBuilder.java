package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    private String url;
    private int port;
    private String user;
    private String password;
    private int timeout;

    public ConnectionBuilder url(String url) {
        this.url = url;
        return this;
    }

    public ConnectionBuilder port(int port) {
        this.port = port;
        return this;
    }

    public ConnectionBuilder user(String user) {
        this.user = user;
        return this;
    }

    public ConnectionBuilder password(String password) {
        this.password = password;
        return this;
    }

    public ConnectionBuilder timeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public Connection build() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        DriverManager.setLoginTimeout(timeout);
        return connection;
    }

}
