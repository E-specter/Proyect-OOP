package dev.Lovelace.EventPro.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database URL
    String user = "your_username"; // Replace with your database username
    String password = "your_password"; // Replace with your database password

    return DriverManager.getConnection(url, user, password);
  }
}