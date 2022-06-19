package constructor_inheritance;

public class Chain_Constructor {
	Chain_Constructor()
	{
		System.out.println("default constructor");
	}
	Chain_Constructor(int a)
	{
		this();
		System.out.println(" constructor 1");
	}
	Chain_Constructor(int a,int b)
	{
		this(100);
		System.out.println(" constructor 2");
	}
	Chain_Constructor(int a,int b,int c)
	{
		this(100,200);
		System.out.println(" constructor 3");
	}
	
	public static void main(String[] args) {
		Chain_Constructor  c=new Chain_Constructor(100,200,300);
	}
}
