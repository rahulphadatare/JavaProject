package constructor_inheritance;

public class Father extends Grandfather {
	String fn;
	
	void setFdata(String fn)
	{
		this.fn=fn;
	}
	
	void display()
	{
		super.display();
		System.out.println("Father name: "+fn+" "+super.fn+" "+ln);
	}
}
