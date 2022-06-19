package constructor_inheritance;
class A
{
	A()
	{
		
		System.out.println("default constructor");
	}
	A(int a)
	{
		System.out.println("parameter constructor A");
	}
}
class B extends A {
	B()
	{
		super(100);
		System.out.println("default constructor");
	}
	B(int a)
	{
		super(100);
		System.out.println("parameter constructor B");
	}
	void disply()
	{
		System.out.println("in class B display method");
	}
}
public class Ex {
	
	
	
	public static void main(String[] args) {
		B b=new B();
		b.disply();
	}
	
	
	
}
