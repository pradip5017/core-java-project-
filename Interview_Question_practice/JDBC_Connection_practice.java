package Interview_Question_practice;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		//1 add/ register driver in program
		Class.forName("com.mysql.cs.jdbc.Driver");
		
		//2 add a establish connection interface
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc1","root","root");
		
		//3 create statement interface in project
		Statement stmt = con.createStatement();
		
		// 4 execution of query
		stmt.executeUpdate("create table pradip(id int, name charchar(40), address varchar(50))");
		
		// 5 close of connection 
		con.close();
		
		
	}

}
