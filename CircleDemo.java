
public class CircleDemo 
{
  double Radius;
  double pi = 3.14;
  
  public double getRadius()
  {
	  return Radius;
  }
  
  public void setRadius(double r)
  {
	Radius = r; 
  }
  
  public double CalcArea()
  {
	  return pi*Radius*Radius;
  }
  
}
