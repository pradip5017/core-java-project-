package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice3 {
	public static void mainI(String args[]) throws ClassNotFoundException, SQLException
	{
		// there are follow five stem in jdbc conection
		// 1 create and add driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 create establis connection in java
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc1","root","root");
		
		// 3 create statement object
		Statement stmt = con.createStatement();
		
		//4 execute of Query
		stmt.executeUpdate("create table pradip(id int, name varchar(50),address varchar(50)");
		
		//5 close of connection
		
		con.close();
		System.out.println("Table Create successfully..!!");
	}

}
