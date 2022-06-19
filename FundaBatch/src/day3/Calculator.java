package day3;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two no");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("choose 1 for add,2 for sub,3 for mul, 4 for div and 5 for mod");

	int c=sc.nextInt();
	if(c==1)
	{
		int a=n1+n2;
		System.out.println("Addition is ="+a);
	}
	else if(c==2)
	{
		int a=n1-n2;
		System.out.println("Substraction is ="+a);
	}
	else if(c==3)
	{
		int a=n1*n2;
		System.out.println("Multiplicaton is ="+a);
	}
	else if(c==4)
	{
		int a=n1/n2;
		System.out.println("Division is ="+a);
	}
	else if(c==5)
	{
		int a=n1%n2;
		System.out.println("Mod is ="+a);
	}
	
}
}
