import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TaskGetSet {

	public static void main(String[] args)
	{
	List<Employee> emp=new ArrayList<Employee>();
	Employee e[]=new Employee[50];
	Scanner s=new Scanner(System.in);
	System.out.println("how many emp we want store :");
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		Scanner s1=new Scanner(System.in);
		 int empid=s1.nextInt();
		 
		 String name=s1.next();
		 String emailid=s1.next();
		 double ph=s1.nextDouble();
		 float sal=s1.nextFloat();
		 
		  String company=s1.next();
		  char gender=s1.next().charAt(i);
		  String dob=s1.next();
		  String doj=s1.next();
		  String distct=s1.next();
		  String city=s1.next();
		
		
	}
	System.out.println(emp.size());
	
	for(int i=0;i<n;i++)
	{
		System.out.println(emp.get(i).getEmpid());
	}

	
	
	

	}

}
