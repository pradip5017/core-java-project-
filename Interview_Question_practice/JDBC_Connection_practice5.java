package Interview_Question_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice5 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
		// there are folow five step of jdbc connection
		//1 add and register driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 create and establis connection interface in progream
		Connection con = DriverManager.getConnection("jdbc:mysql/localhost:3306/Database","root","root");
		
		//3 create statement inteface in memory
		Statement stmt = con.createStatement();
		
		// 4 execute of query
		stmt.executeUpdate("create table pradip(id int primary key, name varchar(50), salary bigint)");
		
		// close of connection 
		con.close();
		System.out.println("Table created Successfully..!!");
		
	}

}
