package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice12 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		// there are follow five step of jdbc 
		
		// 1 create and add driver in memory
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. create establis connection interface;
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc","root","root");
		
		// 3 create Statment interface;
		
		Statement stmt = con.createStatement();
		
		// 4 execute of query
		
		stmt.executeUpdate("create table pradip(id int, name varchar(40), address varchar(50) )");
		
		// 5 close of connection interface
		
		System.out.println("Table created Successfully..!!");
		con.close();
		
	}

}
