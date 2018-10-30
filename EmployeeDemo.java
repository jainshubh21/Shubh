
public class EmployeeDemo 
{
  int EmpId;
  String EmpName;
  float Salary;
  
  public int getEmpId()
  {
	  return EmpId;
  }
  public void setEmpId(int id)
  {
	  this.EmpId = (id>0)?id:1;
  }
  
  public String getEmpName()
  {
	  return EmpName;
  }
  
  public void setEmpName(String name)
  {
	  EmpName = name;
  }
  
  public float getSalary()
  {
	  return Salary;
  }
  
  public void setSalary(float sal)
  {
	  this.Salary = (sal>0.0)?sal:1;
  }
  
  public float CalcSalary()
  {
	  return Salary*12;
  }
}
