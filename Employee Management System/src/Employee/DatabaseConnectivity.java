package Employee;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class DatabaseConnectivity {

	public Connection conn;	//interface
	public Statement stmt;	//interface
	
	public DatabaseConnectivity() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystemdb","root","");
			stmt = conn.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] arg) {
		new DatabaseConnectivity();
	}
}
