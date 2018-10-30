
public class TriangleDemo 
{
  double Height;
  double Base;
  
  public double getBase()
  {
	  return Base;
  }
  
  public void setBase(double b)
  {
	  this.Base = (b>0)?b:1;
  }
  
  public double getHeight()
  {
	  return Height;
  }
  
  public void setHeight(double h)
  {
	  this.Height = (h>0)?h:1;
  }
  
  public double CalcArea()
  {
	  return 0.5*Base*Height;
  }
}
