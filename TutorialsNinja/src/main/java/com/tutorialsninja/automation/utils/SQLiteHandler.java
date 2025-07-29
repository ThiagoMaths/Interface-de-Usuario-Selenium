package com.tutorialsninja.automation.utils;

import java.sql.*;

public class SQLiteHandler {

    private static final String DB_URL = "jdbc:sqlite:test.db";
    private static Connection connection;
    private static int counter = 0;

    public SQLiteHandler() {
        try {
            connection = DriverManager.getConnection(DB_URL);
            createUserTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public void createUserTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "email VARCHAR(255) NOT NULL UNIQUE,"
                + "password VARCHAR(255) NOT NULL)";

        try (Statement statement = connection.createStatement()) {

            statement.execute(sql);
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Table creation failed");
        }
    }

    public void insertUser(String email, String password) {
        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            counter++;

            if (counter >= 10) {
                closeConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Insert failed");
        }
    }

    public String getUserByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, email);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("password");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error find email" + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection2() {
        return this.connection;
    }
}
