package net.ausiasmarch.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariConfiguration {
    private static final HikariDataSource webpool;

    static {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(DatabaseParameters.getUrl());
        config.setUsername(DatabaseParameters.getUser());
        config.setPassword(DatabaseParameters.getPassword());

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(30000);
        config.setConnectionTimeout(30000);
        config.setPoolName("MiHikariPool");

        webpool = new HikariDataSource(config);
    }

    public static DataSource getPool() {
        return webpool;
    }

    public static void closePool() {
        if (webpool != null && !webpool.isClosed()) {
            webpool.close();
        }
    }

    public static Connection getConnection() throws SQLException {
        return webpool.getConnection();
    }

}