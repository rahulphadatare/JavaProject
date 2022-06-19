package interface_1;

	class A{
	
	void display()
	{
		System.out.println("in parent display");
	}
}

interface D{
	
	public void display();
}
public class Interface_inheritance extends A implements D{
	 
	public void display()
	{
		System.out.println("in chiled display");
	}
	

	
	public static void main(String[] args) {
	
		Interface_inheritance c1=new Interface_inheritance();
		c1.display();
	}
}
