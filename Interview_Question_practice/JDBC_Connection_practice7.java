package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice7 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		// folow 5 step of jdbc
		//1 create And Add Driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 create and establis connection interface
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/example","root","root");
		
		// 3 create  statement inteface
		Statement stmt = con.createStatement();
		
		//4 execute update
		stmt.executeUpdate("Create table Pradip1(id int, name varchar(50), address varchar(60))");
		
		// 5 close of connection
		
		con.close();
		
	}

}
