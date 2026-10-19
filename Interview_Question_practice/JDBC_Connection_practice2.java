package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice2 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
		// there are five step of jdbc connection  in java
		
		// create and add driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// create and establis connection inteface
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc1","root","root");
		
		// create statement interface
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("create table solution (int id, name varchar(50), address varchar(60))");
		
		
		con.close();
		
		System.out.println("Data save Successfully..!!");
		
	
		
	}

}
