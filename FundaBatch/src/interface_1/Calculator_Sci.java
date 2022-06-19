package interface_1;

public class Calculator_Sci implements Calculator {
	int a=2,b=3;
	public void add()
	{
		System.out.println("addition : "+(a+b));
	}
	public void sub()
	{
		System.out.println("substraction : "+(a-b));
	}
	public void mul()
	{
		System.out.println("multiplication : "+(a*b));
	}
	public void div()
	{
		System.out.println("division : "+(6/2));
	}
	
	void power()
	{
		System.out.println("power 2^3: "+Math.pow(a, b));
	}
	void sqRoot()
	{
		System.out.println("sq.root of 49 is: "+Math.sqrt(49));
	}
}
