package Interview_Question_practice;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection3 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		//1 Add driver in memory
		Class.forName("Com.mysql.cj.jdbc.Driver");
		
		//2 Create and establish connection interface
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
	// 3 Create Statement object of a class
		
		Statement stmt = con.createStatement();
		
		// execution of query
		
		stmt.executeUpdate("create table Pradip(id int , name varchar(50), address varchar(50))");
		
		// close of connection
		con.close();
		
	
	}

}
