package ASimulatorSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            // Register MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the bankmanagementsystem database
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankmanagementsystem", "root", "Sudi123@#$");

            // Create a statement object for executing SQL queries
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
