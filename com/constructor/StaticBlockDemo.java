package com.constructor;

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		Hello h = new Hello();
	}
}

class Test
{
    Test()
    {
    	super();
    	//IIB
    	System.out.println("One");
    }       
    
    Test(int a)
    {
    	this();
    	System.out.println("Three");
    }
    //IIB(Instance Initialization Block)
    {
    	System.out.println("Two");
    }
}
class Hello extends Test
{
    Hello()
    {
    	super(10);
    	System.out.println("Four");
    }
    static 
    {
    	System.out.println("Five");
    }
}