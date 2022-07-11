package test5_polymorphism;

public class Overload {
	void compair(int a, int b)
	{
		if(a>b)
		{
			System.out.println("Greater no= "+a);
		}
		else
		{
			System.out.println("Greater no= "+b);
		}
	}
	
	void compair(char a, char b)
	{
		if((int)a>(int)b)
		{
			System.out.println("Greater char= "+a);
		}
		else
		{
			System.out.println("Greater char= "+b);
		}
	}
	
	public static void main(String[] args) {
		Overload o=new Overload();
		o.compair(20, 10);
		o.compair('A', 'a');
		
	}
}
