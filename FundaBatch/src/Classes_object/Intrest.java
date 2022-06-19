package Classes_object;

import java.util.Scanner;

public class Intrest {
	
	int multiplication(int p, int i, int t)
	{
		return p*i*t;
	}
	void intrest(int mul)
	{
		System.out.println("Total intrest: "+mul/100);
	}
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter p i t");
	Intrest e1=new Intrest();
	int p=sc.nextInt();
	int i=sc.nextInt();
	int t=sc.nextInt();
	int mul=e1.multiplication(p, i, t);
	e1.intrest(mul);
	
}
}
