package constructor_inheritance;

public class Grandfather {
	String fn,mn;
	static String ln;
	
	void setGdata(String fn, String mn, String ln)
	{
		this.fn=fn;
		this.mn=mn;
		this.ln=ln;
	}
	
	void display()
	{
		System.out.println("Grandfather name: "+fn+" "+mn+" "+ln);
	}
}
