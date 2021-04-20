import java.sql.*;

public class pr2_5{

	public static void main(String args[]){
		
		try{
			class.forName("com.mysql.jdbc.Driver");
			Connection con = new DriverManager.getConnection("jdbc:mysql://localhost/empdb","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executequery("select * from emp");
			ResultSetMetaData md = rs.getMetaData();
			int col = md.getColumnCount();
			System.out.println("column"+col+"name"+""+"datatype");
			for(int i=1;i<=col;i++){
				String col_name = md.getColumnCount(i);
				System.out.println(col_name+""+col_type)
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}