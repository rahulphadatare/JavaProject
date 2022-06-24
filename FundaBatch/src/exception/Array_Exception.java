package exception;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter index no");
	int a=sc.nextInt();
	
	int arr[]= {1,2,3,4,5};
	try
	{
		System.out.println(arr[a]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.getClass();
		e.printStackTrace();
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("Done with exception");
	
}
}
