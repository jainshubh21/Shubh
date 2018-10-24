
public class First {
    public static void main(String args[])
    {
       calc obj = new calc();
	   int d,e;
	   d = Integer.parseInt(args[0]);
       e = Integer.parseInt(args[1]);
       obj.add(d,e);
       obj.sub(d,e);
       obj.mul(d,e);
  }
}

class calc{

   int a,b,sum,sub,mul;
   
   
   public void add(int a, int b){
   sum = a+b;
   System.out.println("The addition is :"+sum);
   }
   
   public void sub(int a, int b){
   sub = a-b;
   System.out.println("The subtraction is :"+sub);
   }

   void mul(int a, int b){
   mul = a*b;
   System.out.println("The multiplication is :"+mul);
   }
   
};

