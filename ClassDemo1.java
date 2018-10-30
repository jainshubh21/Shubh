import java.util.*;

public class ClassDemo1 
{
	public static void main(String []args)
	{
  ClassDemo cd = new ClassDemo();
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the employ id:");
  int id= s.nextInt();
  System.out.println("Enter the employ name:");
  String name= s.next();
  System.out.println("Enter the employ salary:");
  int sal= s.nextInt();
  
  cd.empid = id;
  cd.empname = name;
  cd.salary = sal;
  
  System.out.println("Employ ID is: " +cd.empid);
  System.out.println("Employ Name is: " +cd.empname);
  System.out.println("Employ Salary is: " +cd.salary);
	}
  
}
