package DatabaseTesting;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.sun.jdi.connect.spi.Connection;

public class dbtest {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String [][] details = {
				{"Admin","admin123"},
				{"Admin","ijk"},
				{"ijk","admin123"},
				{"ijk","ijk"}

				};
		
   Class.forName("com.mysql.cj.jdbc.Driver");
   java.sql.Connection connect = DriverManager.getConnection("jdbc:mysql://root@localhost/student");
	 java.sql.Statement statement = connect.createStatement(); 
	 statement.executeUpdate("insert into details values ('John','Male')");
	 
	 statement.executeUpdate("delete from details WHERE name='john'");
	 
	 statement.executeUpdate("delete from details WHERE gender='female'");
	 
	 ResultSet result = statement.executeQuery("Select * from details");
	 while(result.next()) 
	 {
	  System.out.println(result.getString(1) + " " +result.getString(2)); 
	  }
	 
   
	}

}
