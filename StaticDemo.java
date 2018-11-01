import java.util.*;

public class StaticDemo 
{
  String EmpId;
  String EmpName;
  int Salary;
  
  static int TotalSalary;
  public StaticDemo(String EmpId , String EmpName , int Salary )
  {
    this.EmpId = EmpId;
    this.EmpName = EmpName;
    this.Salary = Salary;
    
    //TotalSalary = TotalSalary + Salary;
  }
  public void ShowDetails()
  {
	  System.out.println("Employee ID:" + EmpId);
	  System.out.println("Employee Name:" + EmpName);
	  System.out.println("Employee Salary:" + Salary);
  }
  
  public static void DisplayTotalsalary()
  {
	  System.out.println("The total salary is:" + TotalSalary );

  }
  
  public static void main(String []args)
  {
	  StaticDemo Staticobj = new StaticDemo("S1001" , "Shubham" , 50000);
	  StaticDemo Staticobj1 = new StaticDemo("S1002" , "Irfan" , 45000);
	  StaticDemo Staticobj2 = new StaticDemo("S1003" , "Shivam" , 40000);
	  
	  TotalSalary =Staticobj.Salary+Staticobj1.Salary+Staticobj2.Salary; 	  
	  Staticobj.ShowDetails();
	  Staticobj1.ShowDetails();
	  Staticobj2.ShowDetails();
	  StaticDemo.DisplayTotalsalary();
  }

}
