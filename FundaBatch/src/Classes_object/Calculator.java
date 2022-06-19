package Classes_object;


public class Calculator {
	int a,b;
	void input(int a1, int a2)
	{
		a=a1;
		b=a2;
	}
	void Add()
	{
		
		System.out.println("Addition "+ (a+b));
	}
	void Sub()
	{
		int a=10,b=20;
		System.out.println("Substraction "+ (a-b));
	}
	void Mul()
	{
		int a=10,b=20;
		System.out.println("Multiplication "+ a*b);
	}
	void Div()
	{
		int a=10,b=20;
		System.out.println("Division "+ a/b);
	}
	
public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.input(20, 30);
	c1.Add();
	
	c1.Sub();
	c1.Mul();
	c1.Div();
}
}
