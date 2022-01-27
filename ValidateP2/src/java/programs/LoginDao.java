package java.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String name, String Password){
		boolean status=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		PreparedStatement ps=con.prepareStatement("select*from usererg where name=? and password=?");
		ps.setString(1,name);
		ps.setString(2,Password);
		ResultSet rs=ps.executeQuery();
		status =rs.next();

		}
		catch(Exception e){System.out.println (e);}
		return status;
}
}