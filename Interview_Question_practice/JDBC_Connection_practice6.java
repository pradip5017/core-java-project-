package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice6 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		// There are five step of Jdbc connection
		// 1 add driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 create and establis connection integerface in program
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","root");
		
		//3 create statment inteface in program
		Statement stmt = con.createStatement();
		
		// 4 Execute Of query;
		stmt.executeUpdate("create table Narayen(id int, name varchar(50), address varchar(60))");
		
		// 5 close conection
		con.close();
	}

}
