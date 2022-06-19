package constructor_inheritance;

public class Son extends Father {
	String fn;
	
	void setSdata(String fn)
	{
		this.fn=fn;
	}
	
	void display()
	{
		super.display();
		System.out.println("son name: "+fn+" "+super.fn+" "+ln);
	}
			
}
