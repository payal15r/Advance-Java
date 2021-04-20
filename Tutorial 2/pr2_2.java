import java.sql.*;
import java.io.*;

public class pr2_2{
	
	public static void main(String args[]){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = new DriverManager.getConnection("jdbc:mysql://localhost/empdb","root","");
			do{
				System.out.println("\n 1. Insert \n 2. Update \n 3. Delete \n 4. Display \n  5. Exit");
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
				
				switch(ch){
					case 1:
						PreparedStatement p = con.PreparedStatement("insert into emp values(?,?,?,?)");
						p.setInt(1,no);
						p.setString(2,name);
						p.setString(3,dept);
						p.setInt(4,sal);
						System.out.println("Add");
						p.executedUpdate();
						break;
						
					case 2:
						PreparedStatement p = con.PreparedStatement("update emp set E_NAME=?,E_DEPT=?,E_SAL=? where E_ID=?");
						p.setInt(1,no);
						p.setString(2,name);
						p.setString(3,dept);
						p.setInt(4,sal);
						System.out.println("Add");
						p.executedUpdate();
						break;
					
					case 3:
						PreparedStatement p = con.PreparedStatement("delete from emp where E_ID=?");
						p.setInt(1,no);
						p.executedUpdate();
						break;
						
					case 4:
						Statement st = con.createStatement();
						ResultSet rs = st.executequery("select * from emp");
						while(rs.next()){
							int id = rs.getInt("E_ID");
							String name = rs.getInt("E_NAME");
							String dept = rs.getInt("E_DEPT");
							int sal = rs.getInt("E_SAL");
				
							System.out.println("id"+id+"name"+name+"dept"+dept+"sal"+sal);
						}
						break;
					
					case 5:
						System.exit(0);
				}
			}while(ch != 4)
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}