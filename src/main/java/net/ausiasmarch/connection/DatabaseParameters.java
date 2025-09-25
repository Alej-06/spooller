package net.ausiasmarch.connection;

public class DatabaseParameters {
    public static final String USER = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/spooller";
    public static final String PASSWORD = "tiger";

    public static String getUser() {
        return USER;
    }

    public static String getUrl() {
        return URL;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}
