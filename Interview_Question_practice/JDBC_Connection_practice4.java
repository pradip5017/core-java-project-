package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice4 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException   
	{
		// there are five stemp of jdbc
		
		// add driver in memory
		Class.forName("com.mysql.jdbc.Driver");
		
		// create and establis connection interface
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/example","root","root");
		
		// create statement interface
		Statement stmt = con.createStatement();
		
		
		// execute of query
		stmt.executeUpdate("create table pradip(id int, name varchar(50),address varchar(60)");
		
		//close of connection interface
		
		con.close();
		
		System.out.println("Table created successfully..!!");
		
	}

}
