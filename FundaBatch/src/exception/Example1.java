package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
	
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
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int arr[]= {2,3,4,5,6};
	System.out.println("Enter 2 no");
	int a=0;
	int b=0;
	try
	{
		a=sc.nextInt();//10
		b=sc.nextInt();//20
		div(a,b);
		
	}
	catch(ArithmeticException | InputMismatchException |ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		e.getClass();
	}
	catch (Exception e)// exception is used at the last catch block
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("finaly block is always exicuted");
		sc.close();
	}
	
	add(a,b);
	index(arr, 3);
	System.out.println("Done with exception");
}
}
