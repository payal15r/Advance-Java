import java.sql.*;

public class pr2_1{

	public static void main(String args[]){
		
		try{
			class.forName("com.mysql.jdbc.Driver");
			Connection con = new DriverManager.getConnection("jdbc:mysql://localhost/empdb","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executequery("select * from emp");
			while(rs.next()){
				int id = rs.getInt("E_ID");
				String name = rs.getInt("E_NAME");
				String dept = rs.getInt("E_DEPT");
				int sal = rs.getInt("E_SAL");
				
				System.out.println("id"+id+"name"+name+"dept"+dept+"sal"+sal);
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}