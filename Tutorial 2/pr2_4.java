import java.sql.*;
import java.io.*;

public class pr2_4{
	
	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = new DriverManager.getConnection("jdbc:mysql://localhost/empdb","root","");
			callable.Statement st = con.prepareCall("{call max_salary()}");{
				Statement.executed();
				Statement.close();
				System.out.println("Succcess...");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

