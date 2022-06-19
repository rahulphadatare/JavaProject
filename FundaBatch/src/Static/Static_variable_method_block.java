package Static;

public class Static_variable_method_block {
	 
	static String clgname="ABC";// Static variable
	int marks=100;
	
	static			// static block
	{
		System.out.println("I'm in static 1");
	}
	static         // we can call static method many times its exicute by serial
	{
		System.out.println("I'm in static 2");
	}
	
	static void clgname()
	{
		Static_variable_method_block s=new Static_variable_method_block();
//		by this object method it can access the non static variable
		clgname="BBB";
		//marks=50; 	this non static variable are not directly use in static
		s.marks=50;		//but its can acces with the object name
		System.out.println(clgname+s.marks);
	}
	void name()
	{
		clgname="aaa";//  in non static method we can access ststic or non static both
		marks=70;
		System.out.println("done");
	}
	public static void main(String[] args) {
		Static_variable_method_block s=new Static_variable_method_block();
		clgname(); // static method are directly access in main not need object
		s.name();  // for non static method use object name
		// static block not need to call
	}
}
