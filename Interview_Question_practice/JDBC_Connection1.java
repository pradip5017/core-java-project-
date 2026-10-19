package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection1 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		//add in driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 create and establish connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
		//3 create statement object 
		Statement stmt= con.createStatement();
		
		//4 execute of query
		
		stmt.executeUpdate("create table pradiprathod(id int, name varchar(50),address varchar(50))");
		
		//5 close connection 
		con.close();
		
		System.out.println("Table created Successfully..!!");
		
	
	}

}
