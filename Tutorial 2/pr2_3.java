import java.sql.*;
import java.io.*;

public class pr2_3{
	
	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = new DriverManager.getConnection("jdbc:mysql://localhost/empdb","root","");
		
				BufferReader br = new BufferReader(new InputStreamReader(System.in));
				String ch =  Integer.parseInt(br.readline());
				
				System.out.println("id");
				int no = Integer.parseInt(br.readline());
				System.out.println("name");
				String name = br.readline()
				System.out.println("dept");
				String dept = br.readline()
				System.out.println("sal");
				int sal = Integer.parseInt(br.readline());
				
				PreparedStatement p = con.PreparedStatement("insert into emp values(?,?,?,?)");
						p.setInt(1,no);
						p.setString(2,name);
						p.setString(3,dept);
						p.setInt(4,sal);
						System.out.println("Add");
						p.executedUpdate();
				
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
				
