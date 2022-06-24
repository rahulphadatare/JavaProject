package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_Try {
	static void add(int a, int b) 
	{
		System.out.println("Addition is: "+(a+b));
	}
	static void index(int arr[],int i)
	{
		System.out.println(arr[i]);
	}
	
	static void div(int a, int b)
	{
		System.out.println("Division in process");
		System.out.println("Division is: "+(a/b));
	}
	
	static void string(String s, int i)
	{
		System.out.println("String char "+s.charAt(i));
	}
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int arr[]= {2,3,4,5,6};
	System.out.println("Enter 2 no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try
	{
		try
		{
			try
			{
				string("india",6);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			index(arr, 6);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		div(a,b);
		
	}
	catch(ArithmeticException | InputMismatchException e)
	{
		e.printStackTrace();
		e.getClass();
	}
	
	add(a,b);
	
		
	
	System.out.println("Done with exception");
}
}
