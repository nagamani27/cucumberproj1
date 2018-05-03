package org.jdbcproj;

import java.util.ArrayList;
import java.util.List;

public class ProgJdbc2 
{
public static void main(String[] args)
{
  List <Employee> emp=new ArrayList<Employee>();
  Employee e1=new Employee();
  e1.setId(1);
  Employee e2=new Employee();
  e2.setId(2);
  emp.add(e1);
  emp.add(e2);
  for(Employee e:emp)
  {
	  System.out.println(e.getId());
  }
	  
  
}
}
