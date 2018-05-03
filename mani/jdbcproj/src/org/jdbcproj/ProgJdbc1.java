package org.jdbcproj;



import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ProgJdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new1_schema","root","root");
	String sql="SELECT * FROM new1_table";
	PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
	ResultSet rs=(ResultSet) ps.executeQuery();
	while(rs.next())
	{
		int empid=rs.getInt("id");
		String name=rs.getString("name");
		System.out.println(empid);
		System.out.println(name);
	}
	
	

	}

}
