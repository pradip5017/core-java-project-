package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice8 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		// there are five step of jdbc java to database connection
		// 1 create add driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 create and establis connection interface
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
		//3 create statement interface 
		Statement stmt = con.createStatement();
		
		//4 execute of query
		
		stmt.executeUpdate("create table pradip(id int, name varchar(60), address varchar(50))");
		
		// close of connection 
		
		con.close();
		System.out.println("Table create Successfully..!!");
		
		
	}

}
