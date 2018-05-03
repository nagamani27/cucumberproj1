package org.jdbcproj;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class BaseJdbc3 
{
	public List<Employee> emp=new ArrayList<Employee>();
	Connection con=null;
    try
    {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new1_schema","root","root");
	String sql="SELECT * FROM new1_table";
	PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
	ResultSet rs=(ResultSet) ps.executeQuery();
	while(rs.next())
	{
		Employee e=new Employee();
		e.setId(rs.getInt("id"));
		
    }
    catch(Throwable e)
	{
	     e.printStackTrace();
	}
	  finally
	  {
	     try
	     {
		    con.close();
	     }
	     catch(SQLException e)
	     {
		     e.printStackTrace();
	     }
	   }
	
return employee;
}
}

