package Interview_Question_practice;
import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection_practice1 {
	public static void main(String args[]) throws SQLException, ClassNotFoundException 
	{
		// jdbcd connection 
		// for the five step of jdbc connectio in java to mysql database
		
		//1 create and and Driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 create and establis conection interface 
		Connection con = DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc1","root","root");
		//3 create statement object in program
		Statement stmt = con.createStatement();
		
		//4 execution of query
		
		stmt.executeUpdate("create table  pradipbhau(id int, name varchar(50), address varchar(50))");
		
		//5 close connection statement 
		con.close();
		System.out.println("Table created successfully..!!");
	}
}
