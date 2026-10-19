package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice9 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException 
    {
        // 1. Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 2. Establish Connection
        // Replace "yourdbname" with your database name
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "root");
        
        // 3. Create Statement
        Statement stmt = con.createStatement();
        
        // 4. Execute Query
        stmt.executeUpdate("CREATE TABLE pradip (id INT, name VARCHAR(50), address VARCHAR(89))");
        
        // 5. Close Connection
        con.close();
        
        System.out.println("Table created successfully!");
    }
}
