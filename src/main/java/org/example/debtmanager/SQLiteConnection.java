package org.example.debtmanager;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLiteConnection {
    public static void loadData() {
        String sql = "SELECT id, name, phone_number FROM customer";
        try (Connection connection = connector()) {
            boolean isConnected = connection != null && !connection.isClosed();
            System.err.println("isConnected : " + isConnected);
            if (isConnected) {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                {

                    while (rs.next()) {
                        System.out.println(rs.getString("id") + "\t" + rs.getString("name"));
                        System.out.println(rs.getString("phone_number"));
                    }
                }
            }
        } catch (SQLException e) {
            crashTheApp();
        }
    }

    private static Connection connector() {
        Connection connection = null;
        try {
            // Ensure the JDBC driver is loaded
            Class.forName("org.sqlite.JDBC");

            // Define the connection URL (jdbc:sqlite: plus the database file path)
            // The file can be relative to the project or an absolute path
            String url = "jdbc:sqlite:D:/projects/debtmanagerDB.db";

            connection = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite DB established.");

        } catch (ClassNotFoundException | SQLException e) {
            Logger.getAnonymousLogger().log(Level.SEVERE, "Could not connect to SQLite DB", e);
        }
        return connection;
    }


    private static void crashTheApp() {
        throw new RuntimeException("could not connect to DB!");
    }
}

