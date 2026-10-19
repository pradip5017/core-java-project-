package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice11 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		// there are 5 step of jdbc in java 
		//1 create and register driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 create and estblish connection interface in project
		Connection con =DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc1","root","root");
		
		//3 create statement object of program
		Statement stmt= con.createStatement();
		
		// 4 execute of query
		stmt.executeUpdate("create table Laptop11(int id, name varchar(50), address varchar(40)");
		
		//5 close of connection
		con.close();
		
			
	}

}
