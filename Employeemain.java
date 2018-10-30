import java.util.*;
public class Employeemain 
{
  public static void main(String []args)
  {
	  EmployeeDemo Ed = new EmployeeDemo();
	  
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the Employee id:");
	  int id = s.nextInt();
	  System.out.println("Enter the Employee Name:");
	  String name = s.next();
	  System.out.println("Enter the Employee Salary:");
	  float sal = s.nextFloat();
	  
	  Ed.setEmpId(id);
	  Ed.setEmpName(name);
	  Ed.setSalary(sal);
	  
	  System.out.println("Detail of Employee are:");
	  System.out.println("Employee Id:" +Ed.getEmpId());
	  System.out.println("Employee Name:" +Ed.getEmpName());
	  System.out.println("Employee Salary:" +Ed.getSalary());
	  System.out.println("Per Annum Salary of the Employee is:" +Ed.CalcSalary());
	  
  }
}
