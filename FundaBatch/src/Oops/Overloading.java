package Oops;

public class Overloading {

	void add(int a, int b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Addition is= "+(a+b+c));
	}
	void add(float a, int b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	void add(int a, float b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	void add(float a, float b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	void add(String a, int b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	void add(String a, String b)
	{
		System.out.println("Addition is= "+(a+b));
	}
	 
	public static void main(String[] args) {
		 Overloading o=new Overloading();
		 o.add(10, 100);
		 o.add(10, 10.20f);
		 o.add(10.0f, 020);
		 o.add(10.2f, 10.0f);
	}
}
