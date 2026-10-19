package object_class;

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {
	public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
		// write a program of jdbc connection in java
		// there are five step of connection of java to database
		
		//1 add and register Driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2 create and establish connectionS of a java
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
//		3 create Statement object of program
		Statement stmt = con.createStatement();
		
		//4 execute of query
		stmt.executeUpdate("insert into pradip1 values(14,'vikash','pune')");
		
		//5 close of connection 
		con.close();
		System.out.println("Data inserted successfully..!!");
}

}