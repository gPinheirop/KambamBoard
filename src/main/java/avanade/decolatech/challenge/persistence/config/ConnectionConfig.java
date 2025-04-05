package avanade.decolatech.challenge.persistence.config;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost:3306/kambamboard";
        var user = "kambamboard";
        var password = "kambamboard";

        var connection = DriverManager.getConnection(url, user, password);

        connection.setAutoCommit(false);
        return connection;
    }
}
