package Interview_Question_practice;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC_Connection {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		
		// there are five step of jdbc connection to java to database
		
		//1 create and Resister jdbc Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 create and establish connecton interface of class
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
				//3 create Statement object of class
		Statement stmt = con.createStatement();
		
		// 4 execute of query
		//stmt.executeUpdate("create table pradiprathod(id int, name varchar(50), Address varchar(40))");
		//stmt.executeUpdate("insert into pradiprathod values(2,'pradip rathod1212','pune')");
		//stmt.executeUpdate("update pradiprathod set name='pradip rathod' where id=2");
		stmt.executeUpdate("create table  pradiprathod1 values(id int, name varchar(50), address varchar(50))");
		
		//5 close connection interface
		
		con.close();
		System.out.println("Tables created..!!");
		
	}
}






/*

package jdbc;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_table_pracitce {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		
		// there are five step of jdbc connection to java to database
		
		//1 create and Resister jdbc Driver in memory
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 create and establish connecton interface of class
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
		
				//3 create Statement object of class
		Statement stmt = con.createStatement();
		
		// 4 execute of query
		//stmt.executeUpdate("create table pradiprathod(id int, name varchar(50), Address varchar(40))");
		//stmt.executeUpdate("insert into pradiprathod values(2,'pradip rathod1212','pune')");
		//stmt.executeUpdate("update pradiprathod set name='pradip rathod' where id=2");
		stmt.executeUpdate("delete from pradiprathod where id=3");
		
		//5 close connection interface
		
		con.close();
		System.out.println("Tables created..!!");
		
	}
}
*/
