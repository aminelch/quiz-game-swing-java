package qcm.mysql;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {
    public static final String URL = "jdbc:mysql://localhost:3306/java_miniprojet";
  
    public static final String USERNAME = "aminelch";
  
    public static final String PASSWORD = "demo";
 
    public static Connection getConnection() {
        Connection connection = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return connection;
    }
 
}
